def solution(num_list):
    for index,i in enumerate(num_list):
        if i<0:
            return index
    return -1