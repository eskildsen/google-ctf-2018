from pwn import * # pip install --upgrade pwntools

HOST = 'sftp.ctfcompetition.com'
PORT = 1337

r = remote(HOST, PORT)

r.sendline('yes')
r.sendline('pZBbdBEnmlVHvWk')

print('+++Logged in+++')

r.interactive()