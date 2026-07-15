def solution(babbling):
    words = ["aya","ye","woo","ma"]
    cnt = 0
    while babbling:
        ba = babbling.pop()
        br = False
        while True:
            l = len(ba)
            for w in words:
                if ba.find(w) == 0:
                    ba = ba[len(w):]
                    if ba.find(w) == 0:
                        br = True
                        break
            if (l == len(ba)) | br:
                break
            if ba=="":
                cnt+=1
                break
            
            
            
                
    return cnt