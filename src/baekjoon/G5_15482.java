package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G5_15482 { // DP,파싱,문자열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S1 = br.readLine();
        String S2 = br.readLine();
        int[][] dp = new int[S1.length()+1][S2.length()+1];
        for (int i = 0; i < S1.length(); i++) {
            for (int j = 0; j < S2.length(); j++) {
                if(S1.charAt(i) == S2.charAt(j))
                    dp[i+1][j+1] = dp[i][j]+1;
                else
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        System.out.println(dp[S1.length()][S2.length()]);
    }
}