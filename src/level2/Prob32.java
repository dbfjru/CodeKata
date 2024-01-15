package level2;

public class Prob32 {
    //Title : 내적
    static class Solution {
        public int solution(int[] a, int[] b) {
            int answer = 0;
            int length = a.length;
            for(int i = 0; i<length; i++){
                answer += a[i]*b[i];
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1,2,3,4};
        int[] b = {2,3,4,5};
        System.out.println(sol.solution(a,b));
    }
}
