def solution(my_string):
    my_string = my_string.lower()
    li = list(my_string)
    li.sort()
    return ''.join(li)