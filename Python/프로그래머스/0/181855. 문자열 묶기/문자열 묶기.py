def solution(strArr):
    answer = 0
    li = list(map(lambda x: len(x),strArr))
    for i in range(1,31):
        if answer < li.count(i):
            answer=li.count(i)
    return answer