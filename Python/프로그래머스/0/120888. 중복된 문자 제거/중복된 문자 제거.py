def solution(my_string):
    l = [False]*26
    r = [False]*26
    sp = False
    answer = ''
    
    for m in my_string:
        if m.islower():
            #소문자
            if not l[97-ord(m)]:
                l[97-ord(m)] = True
                answer += m
                
        elif m.isupper():
            #대문자
            if not r[65-ord(m)]:
                r[65-ord(m)] = True
                answer += m
        elif not sp:
            answer += " "
            sp = True
                
    return answer