def solution(arr):
    for i,a in enumerate(arr):
        if (a%2 and a<50):
            arr[i] = a*2
        elif (a%2==0 and a>=50):
            arr[i] = a//2
    return arr
