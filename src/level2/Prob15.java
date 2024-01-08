package level2;

public class Prob15 {
    //Title : 나머지가 1이 되는 수 찾기
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int divider = 2;
            int remainder = 0; //
            while(true){ // 2부터 나누면서 나머지가 1이 되는 순간 저장하고 break
                remainder = n%divider;
                if(remainder == 1){
                    answer = divider;
                    break;
                }
                divider++;
            }
            return answer;
        }
    }
}
