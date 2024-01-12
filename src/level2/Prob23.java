package level2;

public class Prob23 {
    //Title : 콜라츠 추측
    //int 에 곱하기 연산을 하게되면 정수 범위를 초과할 수 있는지 항상 체크하자.
    static class Solution {
        public int solution(int num) {
            int answer = 0;
            if(num == 1){
                return 0;
            }

            int count = 0;
            long temp = num;
            while(count < 500){
                if(temp % 2 ==0 ){
                    temp /= 2;
                }else{
                    temp = temp * 3 + 1;
                }
                count++;
                if(temp == 1){
                    break;
                }
            }
            if(temp != 1 && count == 500){
                return -1;
            }
            answer = count;
            return answer;
        }
    }
}
