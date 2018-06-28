from pwn import * # pip install --upgrade pwntools
from curve25519 import Private, Public
import nacl.secret
import hmac
import hashlib

HOST = 'mitm.ctfcompetition.com'
PORT = 1337

r = remote(HOST, PORT)
print('+++ Getting their keys +++')
r.sendline('s')
theirPublic = r.recv()
theirNonce = r.recv()

myPrivateKey = Private()
myNonce = os.urandom(32)
print('+++ their keys +++')
print('Server public = ' +  theirPublic, 'Server nonce = ' +  theirNonce)
r.sendline(myPrivateKey)
r.sendline(myNonce)

r.interactive()