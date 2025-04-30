package baekjoon;

import java.util.Scanner;

public class S1_14888 {
    static int N;
    static int[] nums;
    static int[] ops = new int[4]; // + - * /
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        nums = new int[N];
        for (int i = 0; i < N; i++) nums[i] = sc.nextInt();
        for (int i = 0; i < 4; i++) ops[i] = sc.nextInt();

        dfs(1, nums[0]);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int idx, int result) {
        if (idx == N) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (ops[i] > 0) {
                ops[i]--;
                switch (i) {
                    case 0: dfs(idx + 1, result + nums[idx]); break;
                    case 1: dfs(idx + 1, result - nums[idx]); break;
                    case 2: dfs(idx + 1, result * nums[idx]); break;
                    case 3: dfs(idx + 1, result / nums[idx]); break;
                }
                ops[i]++;
            }
        }
    }
}
