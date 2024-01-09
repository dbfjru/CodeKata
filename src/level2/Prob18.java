package level2;

public class Prob18 {
    //Title : 문자열을 정수로 바꾸기
    //String 입력에서 -를 어떻게 처리할지에 대해 고민
    class Solution {
        public int solution(String s) {
            int answer = 0;
            if(s.charAt(0) != '-'){
                answer = Integer.parseInt(s);
            }else{ // "negative number case"
                answer = Integer.parseInt(s.substring(1));
                answer *=-1;
            }
            return answer;
        }
    }
}
