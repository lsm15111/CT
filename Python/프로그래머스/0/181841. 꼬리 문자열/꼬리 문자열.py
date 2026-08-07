def solution(str_list, ex):
    return ''.join(list(filter(lambda x: x.find(ex)==-1,str_list)))