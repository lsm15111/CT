package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S2_11725 { // 트리의 부모 찾기 BFS
    static int N;
    static int[] parent;
    static List<List<Integer>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        parent = new int[N+1];
        list = new ArrayList<>();

        // input
        for(int i=0;i<N+1;i++){
            list.add(new ArrayList<>());
        }
        int a,b;
        for(int i=0;i<N-1;i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        bfs();
        output();

    }

    private static void output() {
        StringBuilder sb = new StringBuilder();
        for(int i=2;i<=N;i++){
            sb.append(parent[i]).append("\n");
        }
        System.out.print(sb);
    }


    private static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[N+1];
        visited[1] = true;
        q.add(1);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int n: list.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                    parent[n] = node;
                }
            }
        }
    }
}
