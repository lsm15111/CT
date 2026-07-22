def solution(todo_list, finished):
    result = []
    for i,todo in enumerate(todo_list):
        if not finished[i]:
            result.append(todo)
        
    return result