def solution(strArr):
    return list(filter(lambda x: x.find("ad")==-1,strArr))