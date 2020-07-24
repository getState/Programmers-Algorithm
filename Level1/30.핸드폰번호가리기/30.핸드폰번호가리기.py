def solution(phone_number):
    answer = ''
    for i in range(len(phone_number)-4):
        phone_number = phone_number[:i] + '*' + phone_number[i+1:]
    answer = phone_number
    return answer