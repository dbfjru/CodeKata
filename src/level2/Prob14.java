package level2;
import java.util.HashSet;
public class Prob14 {
    //Title : 약수의 합
    //중복되는 숫자는 고려하지 않기위해 Set을 사용하자.
    class Solution {
        public int solution(int n) {
            int answer = 0;
            HashSet<Integer> measures = new HashSet<>();
            int quotient = 0;
            int modulo = 0;
            for(int i=0; i<n; i++){
                //n이 0도 가능해서 범위 설정을 n/2 에서 n으로 수정
                //이로인해 불필요한 계산이 추가됨
                quotient = n/(i+1);
                modulo = n%(i+1);
                if(modulo == 0){
                    measures.add(i+1);
                    measures.add(quotient);
                }
            }
            for(int elem : measures){
                answer +=elem;
            }
            return answer;
        }
    }
    //계산의 양을 줄일 수 있는 방법을 생각해보자.
}
