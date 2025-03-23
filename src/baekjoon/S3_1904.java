package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1904 { // DP 문제 피보나치 수 증가
    static int MOD = 15746;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N==1){
            System.out.println("1\n");
            return;
        }

        long[] dp = new long[N+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=N;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }
        System.out.println(dp[N]+"\n");
    }
}