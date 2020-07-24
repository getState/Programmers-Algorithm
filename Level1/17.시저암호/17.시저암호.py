def solution(s, n):
    answer = ''
    for element in s:
        if element == ' ':
            answer += ' '
        elif element>='a' and element<='z':
            element = chr(ord(element) + n)
            if element>='a' and element<='z':
                answer += element
            else:
                answer += chr( ord('a') + ord(element) - ord('z') -1 )
        else:
            element = chr(ord(element) + n)
            if element>='A' and element <='Z':
                answer += element
            else:
                answer += chr( ord('A') + ord(element) - ord('Z') -1 )
    return answer