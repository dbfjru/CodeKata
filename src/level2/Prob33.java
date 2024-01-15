package level2;
import java.lang.Math;

public class Prob33 {
    //Title : 약수의 개수와 덧셈
    //약수의 개수가 홀수라는 것의 의미 : 제곱수
    static class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            for(int i = left; i<=right; i++){
                double d = Math.pow(i,0.5);
                if(Math.floor(d) == d){ //제곱수 => 약수의 개수 홀수
                    answer -= i;
                }else{ // 약수의 개수 짝수
                    answer += i;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(3, 6);
        System.out.println(sol.solution(1, 6));
    }
}
