package level2;

public class Prob28 {
    //Title : 없는 숫자 더하기
    //발상의 전환
    static class Solution {
        public int solution(int[] numbers) {
            int answer = 45;
            for(int elem : numbers){
                answer -= elem;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 3, 5, 6, 8, 9, 2};
        System.out.println(sol.solution(numbers));
    }
}
