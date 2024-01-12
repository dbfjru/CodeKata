package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob25 {
    //Title : 나누어 떨어지는 숫자 배열
    //Arrays 와 ArrayList 안의 메소드를 적절히 사용할 것
    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer;
            ArrayList<Integer> intList = new ArrayList<>();
            for (int elem : arr) {
                if (elem % divisor == 0) {
                    intList.add(elem);
                }
            }
            //아무것도 없다면 -1 담아서 리턴
            if (intList.size() == 0) {
                answer = new int[1];
                answer[0] = -1;
                return answer;
            }

            //answer 에 대입
            answer = new int[intList.size()];
            for (int i = 0; i < intList.size(); i++) {
                answer[i] = intList.get(i);
            }
            //오름차순 정렬
            Arrays.sort(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 44, 3, 24, 2, 8, 7, 9, 17, 20, 22};
        int divisor = 4;
        String result = Arrays.toString(sol.solution(arr, divisor));
        System.out.println(result);
    }
}
