package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1;tc<=T;tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int[] A = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++) {
                A[i] = Integer.parseInt(st.nextToken());
                if(A[i]>max)
                    max = A[i];
                if(A[i]<min)
                    min = A[i];
            }

            int ans=0;
            for(int i=min-1;i<=max;i++) {
                int result=0;
                for(int j=0;j<N;j++) {
                    if(i<=A[j]){
                        result+=B*i;
                    }else{
                        result+=P;
                    }
                }
                if(ans<result){
                    ans=result;
                }
            }
            System.out.println("#" + tc + " "+ ans);
        }
    }
}