package baekjoon;

import java.util.Scanner;

public class S2_1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt();
        int[] cables = new int[k];
        long max = 0;

        for (int i = 0; i < k; i++) {
            cables[i] = sc.nextInt();
            max = Math.max(max, cables[i]);
        }

        long left = 1, right = max, result = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;
            for (int c : cables) count += c / mid;
            if (count < n) right = mid - 1;
            else {
                result = mid;
                left = mid + 1;
            }
        }

        System.out.println(result);
    }
}