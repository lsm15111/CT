def solution(rsp):
    li = {'2':'0','0':'5','5':'2'}
    answer = ''
    for i in rsp:
        answer+= li[i]
    return answer