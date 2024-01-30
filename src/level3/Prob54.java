package level3;

public class Prob54 {
    //Title : 2016년
    static class Solution {
        public String solution(int a, int b) {
            String answer = "";
            int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
            int totalDays = 0;
            for(int i = 0; i < a-1; i++){
                totalDays += months[i];
            }
            totalDays+=b-1;
            answer = week[totalDays%7];
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5, 24));
    }
}