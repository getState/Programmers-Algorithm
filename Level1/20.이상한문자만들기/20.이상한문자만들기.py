def solution(s):
    answer = ''
    oddOrEven = 0
    for i in range(len(s)):
        if s[i]==' ':
            answer += ' '
            oddOrEven = 0
        elif oddOrEven%2==0:
            answer += s[i].upper()
            oddOrEven +=1
        else:
            answer += s[i].lower()
            oddOrEven +=1
    return answer