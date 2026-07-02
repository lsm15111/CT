def solution(s):
    li = {}
    
    st = ""
    cnt=0
    for l in s:
        li[l] = li.get(l,0)+1
    
    result = []
    for i in li.items():
        if i[1]==1:
            result.append(i[0])
    
    result.sort()
    
    return "".join(result)