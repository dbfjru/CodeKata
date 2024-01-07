package level1;

public class Prob8 {
    //Title : 각도기
    class Solution {
        public int solution(int angle) {
            int answer = 0;
            if(angle < 90){
                answer = 1;
            }else if(angle == 90){
                answer = 2;
            }else if(angle>90 && angle<180){
                answer = 3;
            }else if(angle == 180){
                answer =4;
            }else{
                answer = 100;
            }
            return answer;
        }
    }// switch문으로 작성하는 방법도 생각해보자
    // 원래 angle을 90으로 나눠서 몫을 가지고 할 생각이었으나 이렇게되면
    // 직각(90)인 케이스와 둔각(90<각<180)인 케이스가 int에서는 구분이 되지 않아서 일단은
    //if ~ else if 로 구현함
}
