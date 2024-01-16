package level2;

public class Prob35 {
    //Title : 부족한 금액 계산하기
    static class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;
            long totalFee = 0;
            int sum = 0;
            for(int i=1; i<=count; i++){
                sum += i;
            }
            totalFee = price * (long)sum;
            if(totalFee - money <=0){

            }else{
                answer = totalFee - money;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3,20,4));

    }
}
