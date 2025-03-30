package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S4_1764 { // 듣보잡, Hash 사용하여 문자열 중복제거
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N, M;
        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++) {
            set.add(br.readLine());
        }
        for(int i=0;i<M;i++) {
            String name = br.readLine();
            if(set.contains(name)) list.add(name);
        }
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for(String str : list) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);

    }
}