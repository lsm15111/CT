def solution(arr, k):
    if k%2:
        for i,a in enumerate(arr):
            arr[i] *=k
    else:
        for i,a in enumerate(arr):
            arr[i] +=k
    return arr