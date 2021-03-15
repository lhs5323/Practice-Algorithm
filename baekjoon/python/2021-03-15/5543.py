import sys
a = []
b = []
for i in range(3):
  a.append(int(sys.stdin.readline()))
for i in range(2):
  b.append(int(sys.stdin.readline()))
print(min(a)+min(b)-50)