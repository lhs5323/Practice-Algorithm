import sys
a = int(sys.stdin.readline().rstrip())
b = int(sys.stdin.readline().rstrip())
c = int(sys.stdin.readline().rstrip())
count = [0]*10
num = str(a*b*c)
for i in num:
  count[int(i)] += 1
for j in count:
  print(j)