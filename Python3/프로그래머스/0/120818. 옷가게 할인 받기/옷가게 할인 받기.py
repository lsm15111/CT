def solution(price):
    sale = 0
    
    if price >= 500_000:
        sale = 0.2
    elif price >= 300_000:
        sale = 0.1
    elif price >= 100_000:
        sale = 0.05
    return int(price - (price*sale))