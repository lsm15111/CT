def solution(numLog):
    back = numLog[0]
    s = ""
    for n in numLog[1:]:
        val = n - back
        match val:
            case 1:
                s += "w"
            case -1:
                s += "s"
            case 10:
                s += "d"
            case -10:
                s += "a"
        back = n
    return s