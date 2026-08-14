def solution(n):
    a=1
    answer = 0
    for i in range(1,12):
        a*=i
        if a > n:
            answer = i-1
            break
    return answer