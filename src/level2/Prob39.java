package level2;

import java.util.Arrays;

public class Prob39 {
    //Title : 최대공약수와 최소공배수
    //최대공약수와 최소공배수를 구하는 과정 생각해볼것
    static class Solution {
        public int[] solution(int n, int m) {
            int[] answer = {0,0};
            int GCD = 1;
            int LCM = 1;
            //GCD Processing -> Wrong;
            for(int i = 1; i <= n ; i++){
                if(n%i == 0){ // n약수
                    if(m%i==0){
                        GCD = i;
                    }
                }
            }
            //LCM Processing
            int left = n/GCD;
            int right = m/GCD;
            int temp = left*right;
            LCM = temp * GCD;
            answer [0] = GCD;
            answer [1] = LCM;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(17, 33)));
        System.out.println(33*17);
    }
}
