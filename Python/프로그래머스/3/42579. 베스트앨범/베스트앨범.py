def solution(genres, plays):
    li = {g: [] for g in set(genres)}
    answer = []
    for idx, (g,p) in enumerate(zip(genres,plays)):
        li[g].append((idx,p))

    li = sorted(li.items(), key=lambda x: sum(p for _, p in x[1]), reverse=True)
    
    print(li)
    
    for genre,play in li:
        a = sorted(play, key=lambda x: x[1],reverse=True)
        count=0
        for idx, p in a:
            if count==2:
                break
            answer.append(idx)
            count+=1
    return answer