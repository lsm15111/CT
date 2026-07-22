def solution(arr, idx):
    li = arr[idx:]
    return li.index(1)+idx if sum(arr[idx:]) else -1