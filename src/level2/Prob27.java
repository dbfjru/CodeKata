package level2;

public class Prob27 {
    //Title : 핸드폰 번호 가리기
    static class Solution {
        public String solution(String phone_number) {
            String answer = "";
            int startIndex = phone_number.length()-4;
            for (int i = 0; i < phone_number.length() - 4; i++) {
                answer += "*";
            }
            answer += phone_number.substring(startIndex);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.solution("01025625804");
        System.out.println(result);
    }
}
