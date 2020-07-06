def solution(answers):
    answer = []
    person1 = [1, 2, 3, 4, 5]
    person2 = [2, 1, 2, 3, 2, 4, 2, 5]
    person3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    result = [0, 0, 0]
    for idx, element in enumerate(answers):
        index1 = idx % 5
        index2 = idx % 8
        index3 = idx % 10
        if person1[index1] == element:
            result[0] += 1
        if person2[index2] == element:
            result[1] += 1
        if person3[index3] == element:
            result[2] += 1
            
    maxResult = max(result)
    for idx, element in enumerate(result):
        if element == maxResult:
            answer.append(idx+1)
    return answer