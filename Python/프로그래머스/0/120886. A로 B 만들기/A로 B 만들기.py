def solution(before, after):
    answer = 1
    li = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    for i in li:
        if before.count(i) != after.count(i):
            answer=0
            break
    return answer