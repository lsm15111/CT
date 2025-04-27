package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_13251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M, N, K;
        double result = 0;
        M = Integer.parseInt(br.readLine());
        N = 0;
        int[] color = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            color[i] = Integer.parseInt(st.nextToken());
            N += color[i];
        }
        K = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++) {
            double value = 1;
            for(int j = 0; j < K; j++) {
                value *= ((double) (color[i]-j) / (N-j));
            }
            result += value;
        }
        System.out.println(result);


    }
}
