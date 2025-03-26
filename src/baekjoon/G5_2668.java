package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class G5_2668 { // 숫자 고르기
    static ArrayList<Integer> list;
    static boolean[] visited;
    static int[] num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        num = new int[N+1];
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        list = new ArrayList<>();
        visited = new boolean[N+1];
        for(int i=1;i<=N;i++){
            visited[i] = true;
            dfs(i,i);
            visited[i] = false;
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    private static void dfs(int start, int target) {
        if(!visited[num[start]]){
            visited[num[start]] = true;
            dfs(num[start], target);
            visited[num[start]] = false;
        }
        if(num[start] == target) list.add(start);
    }
}