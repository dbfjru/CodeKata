package level3;

import java.util.ArrayList;

public class Prob43 {
    //Title : 크기가 작은 부분문자열
    static class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            //
            int length = p.length();
            ArrayList<String> strArr = new ArrayList<>();
            for (int i = 0; i <= t.length() - length; i++) {
                strArr.add(t.substring(i, i + length));
            }//부분 문자열 만들어서 어레이 리스트에 저장
            //대소 비교
            for(String str : strArr){
                int numP = Integer.parseInt(p);
                int portion = Integer.parseInt(str);
                if(portion <= numP)
                    answer++;
            }
            return answer;
        }
    }
    //굳이 어레이리스트에 저장하지 말고 String 내장 함수인 subString을 사용해서 바로 풀도록해보자

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "10203";
        String str2 = "15";
        System.out.println(sol.solution(str1, str2));
    }
}
