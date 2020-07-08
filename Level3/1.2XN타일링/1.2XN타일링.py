def solution(n):
    answer = 0
    arr = [0, 1, 2]
    for i in range(3, n+1):
        temp = ( arr[i-2]+arr[i-1] )%1000000007
        arr.append(temp)
    answer = arr[n]
    return answer