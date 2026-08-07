def solution(myString):
    li = []
    for i in myString.split('x'):
        if ""!=i:
            li.append(i)
    return sorted(li)