package level3;

import java.util.Arrays;

public class Prob56 {
    //Title : 과일 장수
    static class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            // score 의 길이 = 사과의 갯수
            // 판매가능한 사과 상자의 개수 = score.length / m
            // [ 1, 1, 1, 2, 2, 3, 3 ]
            // 정렬한 score를 뒤에서 부터 m 개씩 세면 된다.
            int apples = score.length;
            int boxes = apples/m; // 판매가능 박스의 수
            Arrays.sort(score);
            int scoreindex = score.length; // 가격 계산은 결국 각 상자의 맨 처음 사과가 결정
            for(int i = 1; i<=boxes; i++){
                for(int j = 0; j<m; j++){
                    answer += score[scoreindex - i*m];
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println("sol.solution(4, 3, score) = " + sol.solution(4, 3, score));
    }
}
