package level3;

public class Prob42 {
    //Title : 삼총사
    static class Solution {
        public int solution(int[] number) {
            int answer = 0;
            int sum = 0;
            for (int i = 0; i < number.length - 2; i++) {
                for (int j = i + 1; j < number.length - 1; j++) {
                    for (int k = j + 1; k < number.length; k++) {
                        sum = number[i] + number[j] + number[k];
                        if(sum == 0) {
                            answer++;
                        }
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {-3,-2,-1,0,1,2,3};
        System.out.println(sol.solution(arr));
    }
}
