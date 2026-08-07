def solution(arr):
    col = len(arr) # 열
    row = len(arr[0]) # 행
    if col > row: #열 더 클때
        num = col-row
        for a in arr:
            print(a)
            for n in range(num):
                a.append(0)
    elif row > col: #행 더 클때
        num = row-col
        for n in range(num):
            arr.append([0]*row)
            
        
    return arr