package programmers;

public class ServerExtension_L2 {
    // 예시 실행
    public static void main(String[] args) {
        int[] traffic = {5, 7, 10, 6, 8, 9, 4};
        int threshold = 6;
        int k = 2;

        System.out.println("서버 증설 횟수: " + solution(traffic, threshold, k));
    }

    public static int solution(int[] traffic, int threshold, int k) {
        int answer = 0;
        int n = traffic.length;
        int i = 0;

        while (i < n) {
            if (traffic[i] > threshold) {
                answer++;
                i += k; // k일 후까지 증설하지 않음
            } else {
                i++;
            }
        }

        return answer;
    }


}