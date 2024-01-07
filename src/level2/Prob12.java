package level2;

public class Prob12 {
    //Title : 평균 구하기
    class Solution {
        public double solution(int[] arr) {
            double answer = 0;
            for(int elem : arr){
                answer += elem;
            }
            answer /= arr.length;
            return answer;
        }
    }
}
