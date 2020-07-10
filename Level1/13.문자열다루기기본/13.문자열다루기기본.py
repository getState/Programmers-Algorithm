def solution(s):
    answer = True
    if(len(s)==4 or len(s)==6):
        answer = True
    else:
        return False
    
    for i in range(len(s)):
        if s[i]<'0' or s[i]>'9':
            answer = False
            break
    return answer