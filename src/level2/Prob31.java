package level2;

public class Prob31 {
    //Title : 수박수박수박수박수박수?
    static class Solution {
        public String solution(int n) {
            String answer = "";
            for(int i = 0; i<n ; i++){
                if(i%2 ==0){//'수'
                    answer += "수";
                }else{//'박'
                    answer += "박";
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10));
    }
}
