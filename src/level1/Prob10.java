package level1;

public class Prob10 {
    //Title : 배열의 평균값
    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            double sum = 0;//if int type then auto rounding applied
            for(int elem : numbers){ // Summation by improved for loop
                sum += elem;
            }
            answer= sum/numbers.length;
            return answer;
        }
    }
}
