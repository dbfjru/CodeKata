package level2;

import java.util.Arrays;
import java.util.Collections;

public class Prob34 {
    //Title : 문자열 내림차순으로 배치하기
    //Arrays와 Collections 라이브러리 활용하여 정렬하는 방법
    //How to make primitive [] to wrraper [] easy?
    static class Solution {
        public String solution(String s) {
            String answer = "";
            char[] arr = s.toCharArray();
            Character[] wrappedArr = new Character[arr.length];
            for(int i = 0; i<arr.length; i++){
                wrappedArr[i] = arr[i];
            }
            Arrays.sort(wrappedArr, Collections.reverseOrder());
            for(char elem : wrappedArr){
                answer += ""+elem;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        String s = "caeqfZglk";
        char[] arr = s.toCharArray();
        Character[] arr2 = new Character[arr.length];
        for(int i = 0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}
