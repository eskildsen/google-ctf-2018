#!/bin/sh
while true; do < /dev/urandom tr -dc A-Za-z-0-9 | head -c15 | ./brute ; done
