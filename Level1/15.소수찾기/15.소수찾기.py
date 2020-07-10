def solution(n):
    answer = 0
    arr = [False] * (n+1)
    for i in range(2, int(n/2)+1):
        for j in range(2, int(n/i)+1):
            arr[i*j] = True
    
    for i in range(2, n+1):
        if arr[i]==False:
            answer += 1
    return answer