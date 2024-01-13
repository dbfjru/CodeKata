package level2;

public class Prob26 {
    //Title : 음양 더하기
    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for(int i = 0; i<absolutes.length; i++){
                if(signs[i] == true){
                    answer += absolutes[i];
                }else{
                    answer -= absolutes[i];
                }
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] absolutes = {1, 2, 3, 4, 5};
        boolean[] signs = {true ,true, true, false, false};
        System.out.println(sol.solution(absolutes,signs));
    }
}
