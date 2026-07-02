def solution(quiz):
    answer = []
    
    for q in quiz:
        li = q.split(' ')
        if li[1] == '-':
            if int(li[4])==(int(li[0]) - int(li[2])):
                answer.append("O")
            else:
                answer.append("X")
        else:
            if int(li[4])==(int(li[0]) + int(li[2])):
                answer.append("O")
            else:
                answer.append("X")
    return answer