package level2;

import java.util.Arrays;

public class Prob29 {
    //Title : 제일 작은 수 제거하기
    static class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {-1};
            int min = arr[0];
            if (arr.length != 1 ){
                for(int elem : arr){
                    if(min > elem){
                        min = elem;
                    }
                }
                answer = new int[arr.length - 1];
                int index = 0;
                for(int elem : arr){
                    if(elem != min){
                        answer[index] = elem;
                        index++;
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {4,3,2,1};
        int[] result = sol.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}
