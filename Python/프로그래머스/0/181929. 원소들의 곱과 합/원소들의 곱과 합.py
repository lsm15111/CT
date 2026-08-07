def solution(num_list):
    mul = 1
    sq = 0
    for i in num_list:
        mul*=i
        sq+=i
    return 1 if mul<(sq**2) else 0