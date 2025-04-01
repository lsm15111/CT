package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class G5_5430 { // 파싱, AC 정수 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++) {
            String p = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            Deque<Integer> deque = new ArrayDeque<>();
            for(String s : str.substring(1, str.length()-1).split(","))
                if(!s.isEmpty())
                    deque.add(Integer.parseInt(s));

            System.out.println(AC(deque,p));
        }


    }

    private static String AC(Deque<Integer> deque, String p) {
        boolean dir=true; //ture 앞, false 뒤 방향

        for(int i=0; i<p.length(); i++) {
            switch(p.charAt(i)) {
                case 'R':
                    dir = !dir;
                    break;
                case 'D':
                    if(deque.isEmpty()){
                        return "error";
                    }
                    if(dir){
                        deque.removeFirst();
                    }else{
                        deque.removeLast();
                    }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(!deque.isEmpty()) {
            sb.append(dir ? deque.removeFirst() : deque.removeLast());
            if(!deque.isEmpty()){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}