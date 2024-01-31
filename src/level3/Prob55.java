package level3;

public class Prob55 {
    //Title : 카드 뭉치
    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "";
            int index1 = 0;
            int index2 = 0;
            for(int i = 0; i < goal.length; i++){
                if(index1 < cards1.length && goal[i].equals(cards1[index1])){
                    index1++;
                }else if(index2 < cards2.length && goal[i].equals(cards2[index2])){
                    index2++;
                }else{
                    answer = "No";
                    break;
                }
            }
            if(index1 + index2 == goal.length){ // 성공 조건을 체크할 때 조심하자
                answer="Yes";
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] cards1 = {"i","drink","water"};
        String[] cards2 = {"want","to"};
        String[] goal = {"i","drink","water"};
        System.out.println(sol.solution(cards1,cards2,goal));
    }
}
