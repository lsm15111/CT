import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(solution(topping));
    }
    public static int solution(int[] topping) {
        int answer = -1;
        Set<Integer> frontSet = new HashSet<>();
        Set<Integer> backSet = new HashSet<>();
        for(int t : topping){
            backSet.add(t);
        }
        for(int i=0; i< topping.length -1; i++){
            frontSet.add(topping[i]);

            boolean exist = false;
            for(int j=i+1; j< topping.length; j++){
                if(frontSet.contains(topping[j])){
                    exist = true;
                    break;
                }
            }
            if(!exist){ backSet.add(topping[i]); }
            if(frontSet.size() == backSet.size()){ answer++; }
        }
        return answer;
    }
}