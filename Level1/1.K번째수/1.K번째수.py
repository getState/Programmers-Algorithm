def solution(array, commands):
    answer = []
    for command in commands:
        sliceStart = command[0]
        sliceEnd = command[1]
        findIndex = command[2]
        temp = array[sliceStart-1:sliceEnd]
        temp.sort()
        answer.append(temp[findIndex-1])
    return answer