package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G4_2293 { //DP , 코인 경우의 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n+1];
        int[] cnt = new int[n+1];
        cnt[0] = 1;

        for(int i=1;i<=n;i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1;i<=n;i++){
            for(int j=coin[0];j<=k;j++){
                if(j<coin[i]) continue;
                cnt[j] += cnt[j-coin[i]];
            }
        }
        System.out.println(cnt[k]);
    }
}