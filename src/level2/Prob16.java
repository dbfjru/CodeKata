package level2;

public class Prob16 {
    //Title : x만큼 간격이 있는 n개의 숫자
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long change = (long)x;
            for(int i=0; i<n;i++){
                answer[i] = change*(i+1);
            }
            return answer;
        }
    }
    /*포인트 : int 로 받은 x 값이 곱하기를 하게되면
    * int 의 범위를 넘어서는 순간이 발생하게됨!*/
}
