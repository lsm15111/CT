def solution(my_string, num1, num2):
    
    front = min(num1,num2)
    end = max(num1,num2)
    
    st = my_string[0:front]+ my_string[end] + my_string[front+1:end] + my_string[front] + my_string[end+1:]
    return st