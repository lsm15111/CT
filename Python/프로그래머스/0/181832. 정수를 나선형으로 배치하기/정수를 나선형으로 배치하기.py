def solution(n):
    maxn = n * n
    li = [[0] * n for _ in range(n)]
         # 우 하 좌 상
    xrot = [1,0,-1,0]
    yrot = [0,1,0,-1]
    
    rotnum = 0
    x, y = 0, 0
    li[y][x] = 1
    for i in range(2, maxn + 1):
        # 다음 위치
        nx = x + xrot[rotnum]
        ny = y + yrot[rotnum]

        # 범위를 벗어나거나 이미 값이 있으면 방향 전환
        if nx < 0 or nx >= n or ny < 0 or ny >= n or li[ny][nx] != 0:
            rotnum = (rotnum + 1) % 4
            nx = x + xrot[rotnum]
            ny = y + yrot[rotnum]

        x, y = nx, ny
        li[y][x] = i

    return li