package level2;

import java.util.Arrays;
import java.util.Collections;

public class Prob20 {
    //Title : 정수 내림차순으로 배치하기
    //배열을 정렬할 때는 Arrays 라이브러리를 활용하자
    class Solution {
        public long solution(long n) {
            long answer = 0;
            String temp = ""+n;
            int digits = temp.length(); // 자리수 구하기
            char[] arrChar = new char[digits]; //자리수 만큼의 char 배열 생성
            temp.getChars(0,digits,arrChar,0); //String 에서 char[] 로 한글자씩 저장
            Integer[] arrInt = new Integer[digits]; //Integer 배열 생성
            // 왜 int 배열이 아닌 Integer 배열인가
            // 뒤에 Arrays.sort 에서 역순 정렬할 때, Collections.reverseOrder() 쓰기 위해
            for(int i=0; i<digits ; i++){ // arrInt 에 숫자넣기
                arrInt[i] = arrChar[i]-'0'; //char의 경우 문자를 숫자로 저장하기 때문에 '0'을 빼면 int로 저장가능
            }
            Arrays.sort(arrInt, Collections.reverseOrder());
            temp = ""; // String 비우기
            for(int elem : arrInt) //정렬된 배열을 String 으로 이어붙이기
                temp += elem;
            answer = Long.parseLong(temp); //String -> Long 변환
            return answer;
        }
    }
}
