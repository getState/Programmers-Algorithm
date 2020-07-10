def solution(n):
    answer = ''
    while n!=0:
        if n%3==0:
            answer += "4"
        elif n%3==1:
            answer += "1"
        else:
            answer += "2"
        n = int((n-1)/3)
    answer = answer[::-1]
    return answer