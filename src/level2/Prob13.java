package level2;

import java.util.*;
public class Prob13 {
    //Title : 자릿수 더하기
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            int temp_remainder;
            while(true){
                temp_remainder = n%10; // digit calculation
                n = n/10; // rest numbers
                answer += temp_remainder;
                if(n == 0)
                    break;
            }
            return answer;
        }
    }
}
