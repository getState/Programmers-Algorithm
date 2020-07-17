def solution(n):
    answer = 0
    count = 1
    while True:
        temp = count**2
        if n<temp:
            return -1
        elif n==temp:
            answer = (count+1)**2
            break
        else:
            count += 1
            continue
    return answer