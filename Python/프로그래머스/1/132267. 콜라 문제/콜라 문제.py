def solution(a, b, n):
    answer = 0
    while True:
        v = n//a
        if v==0:
            print(n)
            break
        n = (n%a)+(v*b)
        answer+= v*b
        print(v)
    
    return answer