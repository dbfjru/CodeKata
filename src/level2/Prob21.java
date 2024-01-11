package level2;

public class Prob21 {
    //Title : 하샤드 수
    class Solution {
        public boolean solution(int x) {
            boolean answer;
            int temp = x;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            answer = (x % sum == 0); // 이런식으로 if-else 문을 줄일 수 잇다는 것을 연습하자!
            return answer;
        }
    }
}
