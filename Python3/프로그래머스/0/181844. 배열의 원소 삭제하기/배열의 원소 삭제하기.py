def solution(arr, delete_list):
    answer = []
    for index,i in enumerate(arr):
        if i in delete_list:
            continue
        answer.append(arr[index])
    return answer