def solution(angle):
    answer=0
    answer = (angle//90) *2
    if angle%90:
        answer+=1
    return answer