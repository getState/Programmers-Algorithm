def solution(s):
    answer = ''
    stringLength = len(s)
    if stringLength%2==1:
        answer = s[int(stringLength/2)]
    else:
        start = int(stringLength/2)-1
        end = int(stringLength/2)
        answer = s[start:end+1]
    return answer