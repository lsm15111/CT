def solution(my_string):
    
    t = ["0","1","2","3","4","5","6","7","8","9"]
    li = list(my_string)
    li.sort()
    answer = []
    
    for l in li:
        if l in t:
            answer.append(int(l))
        else:
            break
    return answer