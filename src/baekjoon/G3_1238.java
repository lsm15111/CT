package baekjoon;

import java.util.*;

public class G3_1238 { // 다익스트라, 최단경로

    static class Node implements Comparable<Node> { // 우선순위
        int to, cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static int N, M, X;
    static List<List<Node>> graph = new ArrayList<>();
    static List<List<Node>> reverseGraph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
            reverseGraph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int time = sc.nextInt();
            graph.get(from).add(new Node(to, time));           // 정방향
            reverseGraph.get(to).add(new Node(from, time));    // 역방향
        }

        int[] go = dijkstra(graph, X);          // X -> 모든 노드
        int[] back = dijkstra(reverseGraph, X); // 모든 노드 -> X

        int max = 0;
        for (int i = 1; i <= N; i++) {
            if (go[i] == INF || back[i] == INF) continue;
            max = Math.max(max, go[i] + back[i]);
        }

        System.out.println(max);
    }

    static int[] dijkstra(List<List<Node>> g, int start) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            if (curr.cost > dist[curr.to]) continue;

            for (Node next : g.get(curr.to)) {
                if (dist[next.to] > curr.cost + next.cost) {
                    dist[next.to] = curr.cost + next.cost;
                    pq.add(new Node(next.to, dist[next.to]));
                }
            }
        }

        return dist;
    }
}