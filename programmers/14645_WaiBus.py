# 와이버스 부릉부릉
# N개의 정류장
# Max Ride, Min GetOff
user = [[3, 2],[10, 3],[21, 8],[0, 15]]
N = len(user)   # input("출발,종착력 제외 정거장수 :")
K = 5           # input("출발역에서 탑승하는 사람의 수 : ")

for i in range(N):
    inUser = user[i][0]
    outUser = user[i][1]
    print("탑승승객 : {0}, 하차승객 : {1}".format(inUser, outUser))
    if outUser > K:
        print("하차 승객보다 탑승 승객이 많음 오류!!!")
    else:
        K = K - outUser
    K = inUser + K
    print("{0}번째 정류장 현재 승객인원은 {1}입니다.".format(i,K))
