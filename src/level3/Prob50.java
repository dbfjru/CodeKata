package level3;

import java.util.Arrays;
import java.util.HashMap;

public class Prob50 {
    //Title : 가장 가까운 같은 글자
    static class Solution {
        public int[] solution(String s) {
            int[] answer = {};
            char[] charArr = s.toCharArray();
            HashMap<Character,Integer> charMap = new HashMap<>();
            answer = new int[charArr.length];
            for(int i = 0; i < charArr.length; i++){
                if(!charMap.containsKey(charArr[i])){
                    answer[i] = -1;
                    charMap.put(charArr[i], i);
                }else{
                    answer[i] = i - charMap.get(charArr[i]);
                    charMap.put(charArr[i] , i); //index update
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String result = Arrays.toString(sol.solution("foobar"));
        System.out.println(result);
    }
}
