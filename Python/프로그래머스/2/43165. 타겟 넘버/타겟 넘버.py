def dfs(numbers,target,d,n):
    if d==len(numbers):
        if n==target:
            return 1
        return 0
    minus = dfs(numbers,target,d+1,n-numbers[d])
    plus = dfs(numbers,target,d+1,n+numbers[d])
    return minus + plus
def solution(numbers, target):
    return dfs(numbers,target,0,0)