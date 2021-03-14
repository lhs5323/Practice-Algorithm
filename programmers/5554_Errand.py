# 심부름 가는 길
# 이동경로 : 집, 학교, PC방, 학원
# 초단위 계산
# 전체 이동시간 범위 : 1분<= ms <= 59분59초
moveSs = [31, 34, 7, 151]
totSs = 0
for ss in moveSs:
    totSs = totSs + ss
print("전체 분 {0} : 초{1}".format(totSs//60,totSs%60))