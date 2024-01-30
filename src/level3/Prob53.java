package level3;

import java.util.Arrays;

public class Prob53 {
    //Title : 명예의 전당 (1)
    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] honorPlace = new int[score.length];
            for(int i = 0; i < score.length; i++){
                Arrays.sort(score, 0, i+1);
                if(i<k) {
                    honorPlace[i] = score[0];
                }
                else {
                    honorPlace[i] = score[i-(k-1)];
                }
            }
            return honorPlace;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] result = sol.solution(4, score);
        for(int elem : result)
            System.out.println(elem);
    }
}
//PriorityQueue 로도 풀 수 있다. PriorityQueue 에 대해서 공부한 뒤에 다시 풀어보자.
//관련 답안
//import java.util.*;
//
//class Solution {
//    public int[] solution(int k, int[] score) {
//        int[] answer = new int[score.length];
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        int temp = 0;
//        for(int i = 0; i < score.length; i++) {
//            priorityQueue.add(score[i]);
//            if (priorityQueue.size() > k) {
//                priorityQueue.poll();
//            }
//            answer[i] = priorityQueue.peek();
//        }
//        return answer;
//    }
//}
