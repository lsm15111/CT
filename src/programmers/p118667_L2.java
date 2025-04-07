package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class p118667_L2 {
    public static void main(String[] args) {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};

        System.out.println(solution(queue1, queue2));
    }
    public static int solution(int[] queue1, int[] queue2) {
        int result = -1;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        int sum1 = 0, sum2 = 0;

        //input && sum 설정
        for(int n : queue1) {
            q1.add(n);
            sum1 +=n;
        }
        for(int n : queue2) {
            q2.add(n);
            sum2 +=n;
        }

        int cnt=0, poll=0;

        while(cnt <= queue1.length * 4){
            if(sum1 > sum2){
                poll = q1.poll();
                sum1 -= poll;
                sum2 += poll;
                q2.add(poll);
            }else if(sum1 < sum2){
                poll = q2.poll();
                sum2 -= poll;
                sum1 += poll;
                q1.add(poll);
            }else if(sum1 == sum2){ // 각 큐 원소의 합 같을때 break
                result =cnt;
                break;
            }
            cnt++;
        }
        return result;
    }
}