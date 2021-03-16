import sys
data = list(map(int,sys.stdin.readline().rsplit()))
data.sort()
print(data[1])