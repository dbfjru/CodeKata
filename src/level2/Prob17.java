package level2;

public class Prob17 {
    class Solution {
        public int[] solution(long n) {
            String temp = "" + n;
            int digits = temp.length();
            int[] answer = new int[digits];

            for(int i =0; i<digits;i++){
                answer[i] = (int)(n%10);
                n/=10;
            }
            return answer;
        }
    }
}
/*
* String으로 자릿수를 세는 간편한 방법을 알았다!*/