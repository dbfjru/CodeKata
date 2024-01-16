package level2;

import java.util.Scanner;

public class Prob38 {
    //Title : 직사각형 별찍기
    //sout 으로 별을 한개씩 찍으니 너무 느림.
    //String 으로 한줄 단위로 만들어서 찍어봤으나 속도 개선점 딱히 없음.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //가로
        int b = sc.nextInt(); //세로
        String line = "";
        for(int i =0 ; i<b; i++){
            for(int j=0; j<a; j++){
                line += "*";
            }
            System.out.println(line);
            line ="";
        }
    }
}
