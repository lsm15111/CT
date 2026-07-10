def solution(n):
    answer = 0
    if n%2:
        for i in range(n,0,-2):
            answer+=i
    else:
        for i in range(n,0,-2):
            answer += i*i
    
    return answer