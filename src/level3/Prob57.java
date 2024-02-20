package level3;

import java.util.ArrayList;

public class Prob57 {
    //Title : 모의고사
    static class Solution {
        public int[] solution(int[] answers) {
            ArrayList<Integer> arr = new ArrayList<>();
            int[] solutionOfSt1 = {1, 2, 3, 4, 5};
            int[] solutionOfSt2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] solutionOfSt3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int scoreOfSt1 = scoreAdder(solutionOfSt1, answers);
            int scoreOfSt2 = scoreAdder(solutionOfSt2, answers);
            int scoreOfSt3 = scoreAdder(solutionOfSt3, answers);
            if(scoreOfSt1 >= scoreOfSt2 && scoreOfSt1 >= scoreOfSt3 ){
                arr.add(1);
            }
            if(scoreOfSt2 >= scoreOfSt1 && scoreOfSt2 >= scoreOfSt3 ){
                arr.add(2);
            }
            if(scoreOfSt3 >= scoreOfSt1 && scoreOfSt3 >= scoreOfSt2 ){
                arr.add(3);
            }
            int[] answer = new int[arr.size()];
            int[] answer2 = arr.stream().mapToInt(i->i.intValue()).toArray();
            for(int i = 0; i < arr.size(); i++){
                answer[i] = arr.get(i);
                System.out.println(arr.get(i));
            }
            return answer;
        }
        private int scoreAdder(int[] solutionOfSt, int[] answers){
            int score = 0;
            for(int i = 0; i< answers.length; i++){
                int index = i% solutionOfSt.length;
                if(answers[i] == solutionOfSt[index] ){
                    score++;
                }
            }
            return score;
        }
    }
    public static void main(String[] args) {
        Solution sol =  new Solution();
        int[] scores = {1, 3, 2, 4, 2};
        sol.solution(scores);
    }
}
