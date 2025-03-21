package programmers;

import java.util.HashSet;
import java.util.Set;

public class set_loop_L2 {
    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(solution(topping));
    }
    public static int solution(int[] topping) {
        int answer = -1;
        //중복 제거 (길이비교)
        Set<Integer> frontSet = new HashSet<>();
        Set<Integer> backSet = new HashSet<>();
        //back 다 넣고 시작
        for(int t : topping){
            backSet.add(t);
        }
        for(int i=0; i< topping.length -1; i++){
            frontSet.add(topping[i]);

            // 중복 여부 체크
            boolean exist = false;
            for(int j=i+1; j< topping.length; j++){
                // 앞과 뒤를 비교하여 중복여부 여부확인
                if(frontSet.contains(topping[j])){
                    exist = true;
                    break;
                }
            }
            // 중복이 아닐 시 backSet에 추가
            if(!exist){ backSet.add(topping[i]); }
            // 앞 뒤 길이가 같을때
            if(frontSet.size() == backSet.size()){ answer++; }
        }
        return answer;
    }
}