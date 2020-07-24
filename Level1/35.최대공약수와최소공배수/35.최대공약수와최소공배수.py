def findGcd(a, b):
    while b!=0:
        temp = a%b
        a = b
        b = temp
    return a
def solution(n, m):
    answer = []
    gcd = findGcd(n, m)
    lcm = (n*m) / gcd
    answer.append(gcd)
    answer.append(lcm)
    return answer