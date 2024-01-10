package level2;

public class  Prob19 {
    //Title : 정수 제곱근 판별
    //Math library 를 활용하자.
    class Solution {
        public long solution(long n) {
            long answer = 0;
            double squareRoot = Math.sqrt(n);
            if(squareRoot == Math.floor(squareRoot)){
                double temp = squareRoot + 1;
                answer = (long) Math.pow(temp, 2);
            }else{
                answer = -1;
            }
            return answer;
        }
    }
}
