def solution(my_string, index_list):
    st = ''.join(list(map(lambda x: my_string[x], index_list)))
    return st