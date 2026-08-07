def solution(n):
    # 콜라츠 수열
    # x 짝수 x/2
    # x 홀수 3*x+1
    li = []
    li.append(n)
    while(True):
        if n!=1:
            if n%2: #홀
                n=(3*n)+1
            else: #짝
                n/=2
            li.append(n)
        else:
            break
    return li