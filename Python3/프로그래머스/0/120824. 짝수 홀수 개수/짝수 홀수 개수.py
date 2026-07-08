def solution(num_list):
    even = 0 #짝수
    odd = 0 #홀수
    for i in num_list:
        if i%2:
            odd+=1
        else:
            even+=1
    return [even,odd]