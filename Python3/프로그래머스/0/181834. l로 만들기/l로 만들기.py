def solution(myString):
    answer = ''
    for i in myString:
        if ord(i) < ord('l'):
            i='l'
        answer += i
    
    return answer