package baekjoon;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_16948 { // bfs
    static int[][] map;
    static int[][] result;
    static int[] dx = {-1,1,-2,2,-1,1};
    static int[] dy = {-2,-2,0,0,2,2};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,y,x,resultY,resultX;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        result = new int[n][n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        resultY = Integer.parseInt(st.nextToken());
        resultX = Integer.parseInt(st.nextToken());

        bfs(y,x);

        System.out.println(result[resultY][resultX] - 1);

    }

    private static void bfs(int y, int x) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x,y));
        result[y][x] = 1;

        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(!overCheck(ny,nx) && result[ny][nx] == 0){
                    result[ny][nx] = result[p.y][p.x] + 1;
                    q.add(new Point(nx,ny));
                }
            }
        }

    }
    private static boolean overCheck(int y, int x){
        return 0>y || result.length<=y || 0>x || result.length<=x;
    }
}