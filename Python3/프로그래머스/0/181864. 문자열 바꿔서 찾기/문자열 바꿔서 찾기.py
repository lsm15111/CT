def solution(myString, pat):
    pat = pat.replace("A","O")
    pat = pat.replace("B","A")
    pat = pat.replace("O","B")
    return 0 if myString.find(pat) == -1 else 1