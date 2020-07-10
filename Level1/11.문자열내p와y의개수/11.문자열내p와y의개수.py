def solution(s):
    answer = True
    numP = 0
    numY = 0
    for i in range(len(s)):
        if s[i]=='p' or s[i] == 'P':
            numP += 1
        elif s[i]=='y' or s[i] == 'Y':
            numY += 1
    
    if(numP!=numY):
        answer = False
    

    return answer