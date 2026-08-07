def solution(arr, n):
    if len(arr)%2:
        for i,a in enumerate(arr[::2]):
            arr[i*2] = a+n
    else:
        for i,a in enumerate(arr[1::2]):
            arr[(i*2)+1] = a+n
    return arr