def solution(my_string, is_suffix):
    my = my_string.rfind(is_suffix)
    suflen = len(my_string)-len(is_suffix)
    return 1 if my >= 0 and my == suflen else 0