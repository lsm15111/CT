def solution(data, ext, val_ext, sort_by):
    ext_li = {"code":0,"date":1,"maximum":2,"remain":3}
    answer = []
    for i in data:
        if i[ext_li.get(ext)] <val_ext:
            answer.append(i)
    return sorted(answer,key= lambda x:x[ext_li.get(sort_by)])