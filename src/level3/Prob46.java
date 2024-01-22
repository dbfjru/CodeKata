package level3;

public class Prob46 {
    //Title : 숫자 문자열과 영단어
    //더 좋은 방법이 있을꺄? , 맵으로 풀 수 있을까?
    static class Solution {
        public int solution(String s) {
            int answer = 0;
            char[] chars = s.toCharArray();
            int start_index = 0;
            int end_index = 0;
            String stringAnswer = "";
            while(start_index < chars.length){
                switch(chars[start_index]){
                    case 'o': { //one
                        start_index += 2;
                        stringAnswer += 1;
                        break;
                    }
                    case 't': {
                        if(chars[start_index+1] == 'w'){//two
                            start_index +=2;
                            stringAnswer += 2;
                            break;
                        }else{//three
                            start_index +=4;
                            stringAnswer += 3;
                            break;
                        }
                    }
                    case 'f': {
                        if(chars[start_index+1] == 'o'){//four
                            start_index += 3;
                            stringAnswer += 4;
                            break;
                        }else{//five
                            start_index += 3;
                            stringAnswer += 5;
                            break;
                        }
                    }
                    case 's': {
                        if(chars[start_index+1] == 'i'){//six
                            start_index += 2;
                            stringAnswer += 6;
                            break;
                        }else{//seven
                            start_index += 4;
                            stringAnswer += 7;
                            break;
                        }
                    }
                    case 'e': {//eight
                        start_index += 4;
                        stringAnswer += 8;
                        break;
                    }
                    case 'n': {//nine
                        start_index += 3;
                        stringAnswer += 9;
                        break;
                    }
                    case 'z': {//0
                        start_index += 3;
                        stringAnswer += 0;
                        break;
                    }
                    default :{//number case
                        stringAnswer += chars[start_index];
                    }
                }
                start_index++;
            }
            answer = Integer.parseInt(stringAnswer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("1zerotwozero3"));
    }
}
//테스트 케이스
//1478 → "one4seveneight"
//234567 → "23four5six7"
//10203 → "1zerotwozero3"