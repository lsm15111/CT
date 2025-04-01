package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class S1_2002 { // q 추월
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<String> in = new LinkedList<>();
        Queue<String> out = new LinkedList<>();
        int result=0;
        // input
        for(int i = 0; i < N; i++) {
            in.add(br.readLine());
        }
        for(int i = 0; i < N; i++) {
            out.add(br.readLine());
        }

        while (!out.isEmpty()) {
            String s = out.poll();
            if(!Objects.equals(in.peek(), s)) {
                result++;
                in.remove(s);
            }else in.poll();
        }
        System.out.println(result);
    }
}