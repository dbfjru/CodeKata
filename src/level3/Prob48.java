package level3;

import java.util.ArrayList;
import java.util.Collections;

public class Prob48 {
    //Title : K번째수
    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            ArrayList<Integer> arr;
            for(int i =0; i < commands.length; i++){
                arr = new ArrayList<>();
                int start = commands[i][0] - 1;
                int end = commands[i][1] - 1;
                for(int j = start; j <= end; j++){
                    arr.add(array[j]); // element추가 과정
                }
                Collections.sort(arr);
                answer[i] = arr.get(commands[i][2]-1);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2, 5, 3},{4,4,1},{1,7,3}};
        int[] answer = sol.solution(array,commands);
        for(int elem : answer)
            System.out.println(elem);
    }
}
