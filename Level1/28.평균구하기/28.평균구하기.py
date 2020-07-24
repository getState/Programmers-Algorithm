def solution(arr):
    answer = 0
    for element in arr:
        answer += element
    answer = answer/len(arr)
    return answer