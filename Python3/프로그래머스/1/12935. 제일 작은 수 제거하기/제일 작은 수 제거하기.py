def solution(arr):
    if len(arr)==1:
        return [-1]
    min_val = min(arr)
    answer = []
    for i in arr:
        if min_val != i:
            answer.append(i)
    return answer