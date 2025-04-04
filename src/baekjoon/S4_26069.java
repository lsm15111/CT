package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class S4_26069 { // Set 함수 전염체크
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        String C = "ChongChong";
        boolean check = false;
        HashSet<String> set = new HashSet<>();
        set.add(C);
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(a.equals(C) || b.equals(C)) {
                check = true;
            }

            if((set.contains(a)||set.contains(b)) && check) {

                set.add(a);
                set.add(b);
            }

        }
        System.out.println(set.size());
    }
}