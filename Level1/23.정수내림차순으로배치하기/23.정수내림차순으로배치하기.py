def solution(n):
    answer = 0
    arr = []
    while n>0:
        arr.append(n%10)
        n = int(n/10)
    arr.sort()
    for i in range(len(arr)):
        answer += (10**i) * arr[i]
    return answer