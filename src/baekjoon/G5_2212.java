package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class G5_2212 { // 센서 집중국의 수신 가능 역역의 길이의 합 최소값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        if(K >= N) {
            System.out.println(0);
            return;
        }
        int sum = 0;

        //센서
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        Integer[] diffArr = new Integer[N-1];
        for(int i = 0; i < N-1; i++)
            diffArr[i] = arr[i+1] - arr[i];

        //5. 차이 배열을 내림차순으로 정렬한다.
        Arrays.sort(diffArr, Collections.reverseOrder());

        //6. 차이 배열의 k-1 ~ 마지막 까지의 합을 출력한다.
        for(int i = K-1; i < K-1; i++) {
            sum += diffArr[i];
        }
        System.out.println(sum);
    }
}