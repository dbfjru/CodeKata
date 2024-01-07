package level1;

public class Prob7 {
    //Title : 두 수의 나눗셈
    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;
            answer = (1000*num1)/num2; //연산 순서 중요! 나눗셈을 먼저하면 값이 달라짐
            return answer;
        }
    }
}
