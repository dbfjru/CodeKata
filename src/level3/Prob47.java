package level3;

import java.util.ArrayList;
import java.util.Collections;

public class Prob47 {
    //Title : 문자열 내 마음대로 정렬하기
    static class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = new String[strings.length];
            ArrayList<String> arr = new ArrayList<>();
            for(String str : strings){ // 기준이 되는 문자를 맨 앞에 추가하여 정렬 간편히
                arr.add(str.charAt(n)+str);
            }
            Collections.sort(arr); // 정렬
            for(int i =0; i < arr.size(); i++){
                answer[i] = arr.get(i).substring(1);//맨 앞 글자 제외하고 나머지 할당
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] input = {"sun", "bed", "chair", "car","sports","bedboy","sporex"};

        sol.solution(input,2);
    }
}
//예
//        strings   	    n	        return
//["sun" , "bed",  "car"]	1	["car" , "bed" , "sun"]
//["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
//결국 다른 사람의 풀이 확인 했음
//기준이 되는 문자를 맨 앞에 추가한 뒤 정렬하는 방법은 아주 기발한듯