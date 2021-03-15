import sys
n = int(sys.stdin.readline())
for i in range(n):
  a, b = list(map(int, sys.stdin.readline().rsplit()))
  print("Case #{}: {} + {} = {}".format(i+1, a,b,a+b))