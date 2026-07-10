def solution(num, k):
    for index,n in enumerate(str(num)):
        if n == str(k):
            return index+1
    return -1