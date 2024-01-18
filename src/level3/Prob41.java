package level3;

public class Prob41 {
    //Title : 이상한 문자 만들기
    static class Solution {
        public String solution(String s) {
            String answer = "";
            String[] stringArr = s.split(" ",-1); // 앞뒤에 공백이 들어오는 경우 처리하기 위해 -1 추가
            for(int i = 0; i < stringArr.length; i++){
                //for each String in stringArr
                char[] charArr = stringArr[i].toCharArray();//string to char[]
                for(int j=0; j < charArr.length; j++){;
                    if(j % 2 == 0){ //if even number index then UpperCase by simple arithmetic
                        if(charArr[j] >=97 && charArr[j] <= 122){
                            charArr[j] -= 32;
                        }
                    }else{ // if odd number index then lowerCase by simple arithmetic
                        if(charArr[j] >=65 && charArr[j] <= 90){
                            charArr[j] += 32;
                        }
                    }
                }//hello => HeLlO
                stringArr[i] = ""; // 원래 자리 비우고 변환된 char 넣기
                for(char c : charArr)
                    stringArr[i] += c;
            }
            for(int i = 0; i < stringArr.length; i++){
                if( i != stringArr.length-1){ // 마지막이 아니라면 띄어씌기 추가
                    answer += stringArr[i] + " ";
                }else { // 마지막은 띄어쓰기 없이
                    answer += stringArr[i];
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(" javamukja "));
    }
}
