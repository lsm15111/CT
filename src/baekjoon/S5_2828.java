package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_2828 { // 사과 담기
    public static void main(String[] args) throws IOException {
        int N, M, j, left,right,dis,apple;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        left=0;
        right=left+M-1;
        dis = 0;
        j = Integer.parseInt(br.readLine());
        for(int i=0;i<j;i++){
            apple = Integer.parseInt(br.readLine())-1;

            if(apple<left){
                int dif = left-apple;
                dis+=dif;
                left-=dif;
                right-=dif;
            }
            else if(apple>right){
                int dif = apple-right;
                dis+=dif;
                right+=dif;
                left+=dif;
            }
        }
        System.out.println(dis);
    }
}