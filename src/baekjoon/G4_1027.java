package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G4_1027 { // 고층 건물 브루트포스 기울기 계산
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  // 건물 수
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }

        int maxVisible = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            // 왼쪽 방향
            double maxSlopeLeft = 0;
            for (int j = i - 1; j >= 0; j--) {
                double slope = (double)(height[i] - height[j]) / (i - j);
                if (slope > maxSlopeLeft) {
                    maxSlopeLeft = slope;
                    count++;
                }
            }

            // 오른쪽 방향
            double maxSlopeRight = 0;
            for (int j = i + 1; j < n; j++) {
                double slope = (double)(height[j] - height[i]) / (j - i);
                if (slope > maxSlopeRight) {
                    maxSlopeRight = slope;
                    count++;
                }
            }

            maxVisible = Math.max(maxVisible, count);
        }

        System.out.println(maxVisible);
    }
}