# 카드게임
# 5회의 게임으로 진행
# 총점으로 승부
# 카드는 0<=Ai<=100

ex1 = [1, 2, 3, 4, 5]
ex2 = [0, 100, 0, 10, 100]

def sumCard(clist):
    result = 0
    for i in clist:
        result = result + i
    return result

user_1 = sumCard(ex1)
user_2 = sumCard(ex2)
if user_1 > user_2:
    print("1번 User {0}, 2번 User{1}로 1번User 승리!!".format(user_1, user_2))
elif user_1 < user_2:
    print("1번 User {0}, 2번 User{1}로 2번User 승리!!".format(user_1, user_2))
else:
    print("1번 User {0}, 2번 User{1}로 무승부 입니다.".format(user_1, user_2))
