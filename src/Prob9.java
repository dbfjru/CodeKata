public class Prob9 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int bound = n/2;
            for(int i=1; i<=bound; i++){
                answer += i;
            }
            answer *=2;
            return answer;
        }
    }
    /* argument로 받은 n 값을 2로 나눤 뒤 몫을 구한다.
    * 몫까지의 합을 구한 뒤 2를 곱하면 원하는 범위에서의
    * 짝수의 합을 구할 수 있다.*/
}
