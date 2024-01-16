package level2;

import javax.xml.transform.SourceLocator;
import java.util.Arrays;

public class Prob37 {
    //Title : 행렬의 덧셈
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];
            for(int i = 0; i< arr1.length; i++ ){
                for(int j=0; j < arr1[i].length; j++){
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = {{1,2},{3,4}};
        int[][] answer = sol.solution(arr1,arr2);
        for(int[] intArr : answer){
            System.out.println(Arrays.toString(intArr));
        }
    }
}
