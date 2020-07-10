def solution(s):
    answer = ''
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i]<s[j]:
                s = s[:i]+s[j]+s[i+1:j]+s[i]+s[j+1:]
    answer = s
    return answer