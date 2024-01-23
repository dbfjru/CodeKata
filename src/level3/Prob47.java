package level3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prob47 {
    //Title : 문자열 내 마음대로 정렬하기
    static class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = {};
            String temp = "";
            for(int i = 0; i<strings.length; i++){
                for(int j= i+1; j<strings.length; j++ ){
                    if(strings[i].charAt(n) > strings[j].charAt(n)){
                        System.out.println("big case");
                        temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }else if(strings[i].charAt(n) == strings[j].charAt(n)){
                        System.out.println("equal case");
                        char[] arrI = strings[i].toCharArray();
                        char[] arrJ = strings[j].toCharArray();
                        int length = Math.min(arrI.length,arrJ.length);
                        for(int k = 0; k<length ; k++){
                            if(arrI[k] > arrJ[k]){
                                temp = strings[i];
                                strings[i] = strings[j];
                                strings[j] = temp;
                                break;
                            }else if(arrI[k] < arrJ[k]){
                                break;
                            }else{
                                System.out.println("same character at "+ k);
                            }
                        }
                    }else{
                        System.out.println("small case");
                    }
                }
            }
            answer = strings;
            for(String str : answer){
                System.out.println(str);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] input = {"abce", "abc", "cdx"};
        sol.solution(input,2);
    }
}
//예
//        strings   	    n	        return
//["sun" , "bed",  "car"]	1	["car" , "bed" , "sun"]
//["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
//미완성..