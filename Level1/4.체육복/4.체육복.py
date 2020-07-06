def solution(n, lost, reserve):
    answer = 0
    arr = []
    for i in range(n+1):
        arr.append(1)
    for element in lost:
        arr[element] -=1
    for element in reserve:
        arr[element] +=1
    for i in range(1, n+1):
        if arr[i-1]==0 and arr[i]==2:
            arr[i-1] +=1
            arr[i] -=1
        if i<n and arr[i+1] == 0 and arr[i] ==2:
            arr[i+1] +=1
            arr[i] -=1
    for i in range(1, n+1):
        if arr[i]>0:
            answer +=1
        
    return answer