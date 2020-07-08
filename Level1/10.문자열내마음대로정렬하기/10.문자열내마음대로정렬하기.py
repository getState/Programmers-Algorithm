def solution(strings, n):
    answer = []
    for i in range(len(strings)):
        for j in range(i+1,len(strings)):
            if strings[i][n]>strings[j][n]:
                temp = strings[i]
                strings[i] = strings[j]
                strings[j] = temp
            elif strings[i][n]==strings[j][n] and strings[i]>strings[j]:
                temp = strings[i]
                strings[i] = strings[j]
                strings[j] = temp
        answer.append(strings[i])
    return answer