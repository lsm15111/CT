package programmers;

import java.util.PriorityQueue;

public class p42626_L2 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int s : scoville) {
            pq.offer(s);
        }

        int count = 0;

        while (pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll(); // 가장 안 매운 음식
            int second = pq.poll(); // 두 번째로 안 매운 음식
            int mixed = first + (second * 2);

            pq.offer(mixed);
            count++;
        }

        return pq.peek() >= K ? count : -1;
    }
}
