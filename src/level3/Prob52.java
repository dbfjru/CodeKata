package level3;

public class Prob52 {
    //Title : 콜라 문제
    static class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            int bottles = n;
            int remainder= 0;
            while(!(bottles < a)){
                int temp = (bottles/a)*b;
                answer += temp;
                remainder = bottles % a;
                bottles = temp + remainder;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3,1,20));
    }
}
