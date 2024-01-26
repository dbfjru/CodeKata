package level3;

import java.util.ArrayList;

public class Prob51 {
    //Title : 푸드 파이트 대회
    static class Solution {
        public String solution(int[] food) {
            String answer = "";
            int water = 1;
            int[] servingForOne = new int[food.length-1]; //1인분 준비량
            for(int i = 1; i < food.length; i++){
                servingForOne[i-1] = food[i]/2;
            }
            ArrayList<Integer> foodLine = new ArrayList<>();
            for(int i = 0; i< servingForOne.length; i++){
                if(servingForOne[i] > 0) {
                    int quantity = servingForOne[i];
                    while (quantity > 0) {
                        foodLine.add(i+1); //foodLine에 저장되는 값은 각 음식의 번호 를 갯수만큼 반복
                        quantity--;
                    }
                }
            }
            for(Integer f : foodLine)
                answer += "" + f;
            answer += water;
            for(int i = foodLine.size()-1; i>=0; i--)
                answer += foodLine.get(i);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] food = {1, 3, 4, 6};
        System.out.println(sol.solution(food));
    }
}
/*
* 개선점 : 코드가 너무 복잡하다.
* class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
}
* */