package level3;

import java.util.Arrays;

public class Prob44 {
    //Title : 최소직사각형
    static class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int tmp = 0; //
            for(int i = 0; i < sizes.length; i++){
                if(sizes[i][0] < sizes[i][1]) {//긴 길이가 가로로 오게 통일
                    tmp = sizes[i][1];
                    sizes[i][1] = sizes[i][0];
                    sizes[i][0] = tmp;
                }
            }
            int max_length=sizes[0][0];
            int max_height=sizes[0][1];
            for(int i =0; i< sizes.length; i++){
                if(max_length < sizes[i][0])
                    max_length = sizes[i][0];
                if(max_height < sizes[i][1])
                    max_height = sizes[i][1];
            }
            answer = max_length * max_height;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] sizes = {{60, 50},{30, 70},{60, 30},{80, 40}};
        System.out.println(sol.solution(sizes));
    }
}
