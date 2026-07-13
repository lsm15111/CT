def solution(X, Y):
    li = ['0','1','2','3','4','5','6','7','8','9']
    x_li = [0]*10
    y_li = [0]*10
    for idx,n in enumerate(li):
        x_li[idx] = X.count(n)
        y_li[idx] = Y.count(n)
    answer=""
    for n in range(9,-1,-1):
        answer+=li[n]*min(x_li[n],y_li[n])
    if answer.find("0") == 0:
        answer="0"
    
    if len(answer) == 0:
        answer="-1"
    return answer