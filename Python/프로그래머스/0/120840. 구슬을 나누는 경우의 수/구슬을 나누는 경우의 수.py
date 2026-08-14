from math import factorial as f
def solution(balls, share):
    return int(f(balls)/(f(balls-share)*f(share)))