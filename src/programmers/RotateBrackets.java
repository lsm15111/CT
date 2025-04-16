package programmers;

import java.util.Stack;

public class RotateBrackets {
    public int solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isValid(rotated)) count++;
        }
        return count;
    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ("[{(".indexOf(c) >= 0) stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}