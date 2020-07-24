def solution(x):
    answer = True
    temp = x
    count = 0
    while x>0:
        count += x%10
        x = int(x/10)
    if temp%count==0:
        answer = True
    else:
        answer = False
    return answer