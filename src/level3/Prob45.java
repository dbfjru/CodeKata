package level3;

public class Prob45 {
    //Title : 시저 암호
    static class Solution {
        public String solution(String s, int n) {
            String answer = "";
            char[] input = s.toCharArray();
            for(int i =0; i<input.length; i++){
                if(input[i]>=65 && input[i] <=90){
                    if(input[i]+n<=90){
                        input[i] += n;
                    }else {
                        input[i] += n-26;
                    }
                }else if(input[i]>=97 && input[i] <=122){
                    if(input[i]+n<=122){
                        input[i] += n;
                    }else {
                        input[i] += n-26;
                    }
                }
                answer += input[i];
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("a B z",4));
    }
}
