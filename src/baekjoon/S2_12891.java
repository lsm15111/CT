package baekjoon;

import java.util.Scanner;

public class S2_12891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(), P = sc.nextInt();
        String dna = sc.next();
        int[] min = new int[4];
        for (int i = 0; i < 4; i++) min[i] = sc.nextInt();

        int[] count = new int[4];
        int result = 0;

        for (int i = 0; i < P; i++) count[base(dna.charAt(i))]++;
        if (check(count, min)) result++;

        for (int i = P; i < S; i++) {
            count[base(dna.charAt(i))]++;
            count[base(dna.charAt(i - P))]--;
            if (check(count, min)) result++;
        }
        System.out.println(result);
    }

    private static int base(char c) {
        return switch (c) {
            case 'A' -> 0; case 'C' -> 1; case 'G' -> 2; default -> 3;
        };
    }

    private static boolean check(int[] count, int[] min) {
        for (int i = 0; i < 4; i++) if (count[i] < min[i]) return false;
        return true;
    }
}