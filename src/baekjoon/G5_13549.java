package baekjoon;

import java.util.*;

public class G5_13549 {
    static final int MAX = 100001;
    static int[] dist = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Arrays.fill(dist, -1);
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(N);
        dist[N] = 0;

        while (!dq.isEmpty()) {
            int now = dq.poll();

            if (now == K) {
                System.out.println(dist[now]);
                break;
            }

            // 순간이동 (우선순위 높음 - 0초)
            if (now * 2 < MAX && dist[now * 2] == -1) {
                dist[now * 2] = dist[now];
                dq.addFirst(now * 2);
            }

            // 걷기 -1
            if (now - 1 >= 0 && dist[now - 1] == -1) {
                dist[now - 1] = dist[now] + 1;
                dq.addLast(now - 1);
            }

            // 걷기 +1
            if (now + 1 < MAX && dist[now + 1] == -1) {
                dist[now + 1] = dist[now] + 1;
                dq.addLast(now + 1);
            }
        }
    }
}