package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class G5_13023 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static boolean found = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (found) break;
        }

        System.out.println(found ? 1 : 0);
    }

    static void dfs(int v, int depth) {
        if (depth == 5) {
            found = true;
            return;
        }

        visited[v] = true;

        for (int next : graph[v]) {
            if (!visited[next]) {
                dfs(next, depth + 1);
            }
        }
        visited[v] = false; // 백트래킹
    }
}
