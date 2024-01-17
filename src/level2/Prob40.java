package level2;

import java.util.ArrayList;
import java.util.List;

public class Prob40 {
    //Title : 3진법 뒤집기
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int quotient = n;
            int remainder = 0;
            ArrayList<Integer> trit = new ArrayList<>();
            while(quotient != 0){ //3진법 표현 저장
                remainder = quotient % 3;
                trit.add(remainder);
                quotient /= 3 ;
            }

            ArrayList<Integer> reverseTrit = new ArrayList<>();
            for(int i = trit.size()-1; i>=0; i--){
                reverseTrit.add(trit.get(i));
            }
            for(int i =0; i<reverseTrit.size(); i++){
                answer += (int)Math.pow(3,i) * reverseTrit.get(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(125));
    }
}
