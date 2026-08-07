def solution(wallpaper):
    x, y = [],[]
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[0])):
            if wallpaper[i][j]== "#":
                x.append(j)
                y.append(i)
    return [min(y),min(x),max(y)+1,max(x)+1]