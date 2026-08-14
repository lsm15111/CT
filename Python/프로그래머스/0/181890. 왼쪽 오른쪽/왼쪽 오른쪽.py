def solution(str_list):
    answer = []
    for i in str_list:
        if i in ["l","r"]:
            if i == "l":
                answer = str_list[:str_list.index("l")]
            else:
                answer = str_list[str_list.index("r")+1:]
            break
    return answer