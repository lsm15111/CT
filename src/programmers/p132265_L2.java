package programmers;

import java.util.HashMap;

public class p132265_L2 { // topping 의 종류를 똑같이 나눈 경우의 수
    public static void main(String[] args) {
        int[] topping = {1,2,1,3,1,4,1,2};
        System.out.println(solution(topping));
    }
    public static int solution(int[] topping) {
        int result = -1;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int t : topping){
            map2.put(t,map2.getOrDefault(t,0)+1); // 디폴트로 0을 넣고 +1
        }
        for(int t : topping){
            map1.put(t,map1.getOrDefault(t,0)+1);

            if(map2.get(t) - 1 == 0) map2.remove(t);
            else map2.put(t,map2.get(t) - 1);

            if(map1.size() == map2.size()) result++;
        }
        return result;
    }
}