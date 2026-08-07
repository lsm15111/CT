def solution(ineq, eq, n, m):
    
    result = 0;
    if eq == "=":
        if ineq == ">":
            return 1 if n >= m else 0
        else:
            return 1 if n <= m else 0
    else:
        if ineq == ">":
            return 1 if n > m else 0
        else:
            return 1 if n < m else 0
            
    answer = 0
    return answer