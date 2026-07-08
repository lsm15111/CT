def solution(wallpaper):
    
    start_x = -1
    start_y = -1
    end_x = -1
    end_y = -1

    for wp_i,wp in enumerate(wallpaper):
        if wp.find("#") !=-1: # #있을때
            if start_y == -1: # start Y
                start_y = wp_i
            if end_y < wp_i: # end Y
                end_y = wp_i
            l = wp.find("#") # 좌 인덱스
            r = wp.rfind("#") # 우 인덱스
            print(l,r)
            if start_x == -1: # start X
                start_x = l
            else:
                start_x = min(start_x,l)
            if end_x < r: # end X
                end_x = r
        
    
    answer = [start_y,start_x,end_y+1,end_x + 1]
    return answer