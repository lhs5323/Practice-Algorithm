import sys
n = int(sys.stdin.readline().rstrip())
for i in range(n):
  s = 0
  l = list(map(int, sys.stdin.readline().rsplit()))
  avg = (sum(l)-l[0])/l[0]
  for j in range(len(l)-1):
    if l[j+1] > avg:
      s += 1
    else:
      pass
  print("%.3f%%" % ((s/l[0])*100))