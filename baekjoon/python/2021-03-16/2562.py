import sys
data = []
for _ in range(9):
  data.append(int(sys.stdin.readline()))
print(max(data))
print(data.index(max(data))+1)