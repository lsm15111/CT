def to_sec(time):
    mm,ss = time.split(":")
    ss = int(ss) + (int(mm) * 60)
    return ss

def solution(video_len, pos, op_start, op_end, commands):
    # mm:ss 형식 0:0 ~ 59:59 남은 시간 현재-뺀
    # 10초 전 이동 prev
    # 10초 후 이동 next
    # 이동 후 자동 오프닝 건너뛰기 op_start <= 현재 재생 위치 <= op_end -> op_end 로 이동
    video_len = to_sec(video_len)
    pos = to_sec(pos)
    op_start = to_sec(op_start)
    op_end = to_sec(op_end)
    
    for i in commands:
        if op_start <= pos and pos <= op_end:
            pos = op_end
        match i:
            case "prev":
                pos -= 10
                if pos < 0:
                    pos = 0
            case "next":
                pos += 10
                if pos > video_len:
                    pos = video_len
        print(pos)
    if op_start <= pos and pos <= op_end:
        pos = op_end
    mm = str(pos//60)
    ss = str(pos%60)
    if len(mm) == 1:
        mm = "0"+mm
    if len(ss) == 1:
        ss = "0"+ss
    
    return mm +":"+ ss