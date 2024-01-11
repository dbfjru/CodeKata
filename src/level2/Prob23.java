package level2;

public class Prob23 {
    //Title : 콜라츠 추측
    static class Solution {
        public int solution(int num) {
            int answer = 0;
            if(num == 1){
                return 0;
            }

            int count = 0;
            while(count < 500){
                if(num % 2 ==0 ){
                    num /= 2;
                }else{
                    num = num * 3 + 1;
                }
                count++;
                if(num == 1){
                    break;
                }
            }
            if(num != 1 && count == 500){
                return -1;
            }
            answer = count;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(626331));
    }
}
