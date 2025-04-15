package programmers;

import java.awt.*;
import java.util.ArrayDeque;

public class PCCP2_L2 { // 석유 시추, 한개의 열을 택했을때 제일 많은 석유 시추되는 열 고르기
    // BFS
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int row, col;
    static boolean [][] visited;
    static int max = 0;
    public int solution(int[][] land) {

        row = land.length;
        col = land[0].length;
        for(int i = 0; i < col; i++){
            bfs(i, land);
        }
        return max;
    }

    public static void bfs(int start, int [][] land){
        ArrayDeque<Point> q = new ArrayDeque<>();
        visited = new boolean [row][col];

        int sum = 0;
        for(int i = 0; i < row; i++){
            if(visited[i][start] || land[i][start] == 0) continue;
            sum++;
            visited[i][start] = true;
            q.add(new Point(i, start));
            while(!q.isEmpty()){
                Point cur = q.poll();
                for(int j = 0; j < 4; j++){
                    int nx = cur.x + dx[j];
                    int ny = cur.y + dy[j];
                    if(!overcheck(nx, ny) || visited[nx][ny] || land[nx][ny] == 0) continue;
                    sum++;
                    visited[nx][ny] = true;
                    q.add(new Point(nx,ny));
                }
            }
        }
        max = Math.max(max,sum);
    }
    public static boolean overcheck(int x, int y){
        if(0 <= x && x < row && 0 <= y && y < col) return true;
        return false;
    }
}