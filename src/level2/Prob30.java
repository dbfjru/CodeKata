package level2;

public class Prob30 {
    //Title : 가운데 글자 가져오기
    static class Solution {
        public String solution(String s) {
            String answer = "";
            int length = s.length();
            int index = length/2;
            if(length  % 2 ==0){//even number
                answer = s.substring(index-1, index+1);
            }else{//odd number
                answer = ""+s.charAt(length/2);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("01234567"));
    }
}
