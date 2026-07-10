def solution(a, b):
    answer = 0
    if a%2 and b%2:
        answer = a*a+b*b
    elif a%2 or b%2:
        answer = (a+b)*2
    else:
        answer = abs(a-b)
        
    return answer