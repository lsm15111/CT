def solution(my_string):
    return sorted([my_string[i:] for i in range(len(my_string)-1,-1,-1)])