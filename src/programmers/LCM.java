package programmers;

public class LCM {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++)
            lcm = lcm(lcm, arr[i]);
        return lcm;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}