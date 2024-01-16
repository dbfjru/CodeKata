package level2;

public class Prob36 {
    //Title : 문자열 다루기 기본
    static class Solution {
        public boolean solution(String s) {
            boolean answer = true;
            int length = s.length();
            if(length == 4 || length==6){
                char[] arr = s.toCharArray();
                for(char c : arr){
                    if(c<='9'){
                        //It is number
                    }else{
                        answer = false;
                    }
                }
            }else{
                answer = false;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("1234")); //true;
        System.out.println(sol.solution("a234")); //false;
        System.out.println(sol.solution("12345")); //false;
        System.out.println(sol.solution("123456")); //true;

    }
}
