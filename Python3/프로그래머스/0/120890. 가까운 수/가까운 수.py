def solution(array, n):
    val = 0 
    array.sort()
    if array[0] > n:
        return array[0]
    elif array[len(array)-1] < n:
        return array[len(array)-1]
    for index,arr in enumerate(array):
        if arr > n:
            print(array[index])
            a = n-array[index-1]
            b = array[index]-n
            if a == min(abs(a),abs(b)):
                return array[index-1]
            else:
                return array[index]
