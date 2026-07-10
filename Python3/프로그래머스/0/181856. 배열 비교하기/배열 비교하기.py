def solution(arr1, arr2):
    answer = 0
    len_1,len_2 = len(arr1),len(arr2)
    if len_1 != len_2:
        answer = 1 if len_1 > len_2 else -1
    else:
        sum_1,sum_2 = sum(arr1),sum(arr2)
        if sum_1 != sum_2:
            answer = 1 if sum_1 > sum_2 else -1
        else:
            answer = 0
    return answer