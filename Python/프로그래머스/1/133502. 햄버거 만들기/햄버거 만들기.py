def solution(ingredient):
    # 쌓으면서 햄버거완성 시 제거하는 방법 (스택)
    stack = []
    compare = [1,2,3,1]
    cnt=0
    for i in ingredient:
        stack.append(i)
        if len(stack) >= 4 and stack[-4:] == compare:
            del stack[-4:]
            cnt+=1
    return cnt
            
    
    
    # 쌓아놓고 제거하는 방법이라 히든케이스 안됨
    # s = ""
    # for i in ingredient:
    #     s+=str(i)
    # cnt = 0
    # while True:
    #     li = s.split("1231")
    #     if len(li) >= 2:
    #         cnt += len(li) - 1
    #         s = "".join(li)
    #     else:
    #         break
    # return cnt