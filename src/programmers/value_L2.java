package programmers;

import java.util.Arrays;

public class value_L2 {
    public String solution(int[] numbers) {
        String[] strNums = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0")) {
            return "0"; // 모두 0일 경우
        }

        StringBuilder answer = new StringBuilder();
        for (String num : strNums) {
            answer.append(num);
        }

        return answer.toString();
    }
}