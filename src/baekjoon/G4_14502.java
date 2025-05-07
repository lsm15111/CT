package baekjoon;

import java.util.*;

public class G4_14502 {
    static int N, M, max = 0;
    static int[][] lab;
    static int[][] temp;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        lab = new int[N][M];
        temp = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                lab[i][j] = sc.nextInt();
            }
        }

        dfs(0);
        System.out.println(max);
    }

    static void dfs(int count) {
        if (count == 3) {
            copyLab();
            spreadVirus();
            max = Math.max(max, getSafeArea());
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (lab[i][j] == 0) {
                    lab[i][j] = 1;
                    dfs(count + 1);
                    lab[i][j] = 0;
                }
            }
        }
    }

    static void spreadVirus() {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (temp[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = pos[0] + dx[i];
                int ny = pos[1] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (temp[nx][ny] == 0) {
                        temp[nx][ny] = 2;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    static int getSafeArea() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (temp[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    static void copyLab() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                temp[i][j] = lab[i][j];
            }
        }
    }
}