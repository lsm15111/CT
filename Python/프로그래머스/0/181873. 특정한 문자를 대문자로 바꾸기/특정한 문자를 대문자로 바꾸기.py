def solution(my_string, alp):
    while my_string.find(alp) !=-1:
        index = my_string.find(alp)
        my_string = my_string[:index] + my_string[index].upper() + my_string[index+1:]
    return my_string