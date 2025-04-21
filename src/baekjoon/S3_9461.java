package baekjoon;

import java.util.Scanner;

public class S3_9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] dp = new long[101];
        dp[1] = dp[2] = dp[3] = 1;
        for (int i = 4; i <= 100; i++)
            dp[i] = dp[i - 2] + dp[i - 3];

        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}