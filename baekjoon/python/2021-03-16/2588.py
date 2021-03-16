import sys
a = int(sys.stdin.readline())
b = sys.stdin.readline().rstrip()
b = b[::-1]
for i in b:
  print(int(i)*a)
b = b[::-1]
print(int(b)*a)