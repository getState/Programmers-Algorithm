def solution(arr):
    answer = []
    nowNumber = -1
    for element in arr:
        if element != nowNumber:
            nowNumber = element
            answer.append(element)
    return answer