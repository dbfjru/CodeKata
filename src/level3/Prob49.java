package level3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Prob49 {
    //Title : 두 개 뽑아서 더하기
    //중복을 허용하지 않는다 -> Set 을 써볼까?
    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = {};
            HashSet<Integer> answerSet = new HashSet<>();
            for(int i = 0; i<numbers.length-1; i++){
                for(int j = i+1; j<numbers.length; j++){ //두 수의 합 중복없이 저장
                    answerSet.add(numbers[i] + numbers[j]);
                }
            }
            answer = new int[answerSet.size()];

            int index = 0;
            Iterator<Integer> iterator = answerSet.iterator();
            while(iterator.hasNext()){ //Set -> int[] 로 저장
                answer[index] = iterator.next();
                index++;
            }
            Arrays.sort(answer); // 오름차순 정렬
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {2,1,3,4,1};
        int[] numbers2 = {5,0,2,7};
        sol.solution(numbers2);
    }
}
