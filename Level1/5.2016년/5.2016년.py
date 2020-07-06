def solution(a, b):
    answer = ''
    week = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]
    sumDay = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    count = 0
    for i in range(0,a-1):
        count += sumDay[i]
    count += b-1
    answer = week[(count+5)%7]
    return answer