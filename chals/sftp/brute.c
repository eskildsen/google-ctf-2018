#include <stdbool.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/mman.h>
#include <unistd.h>

bool authenticate_user() {
  char password[16];
  uint16_t hash = 0x5417;
  if (scanf("%15s", password)) {
    getc(stdin);
    for (char* ptr = password; *ptr; ++ptr) {
      hash ^= *ptr;
      hash <<= 1;
    }
    if (hash == 36346) {
      printf("%s", password);
    }
  }
}

int main() {
  authenticate_user();
}
