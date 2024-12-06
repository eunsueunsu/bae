package programmers;

import java.util.Locale;

public class pr12916 {

    public static void main(String[] args) {

    }

    boolean solution(String s) {
        boolean answer = true;


        s= s.toLowerCase();
        int num=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='p') {
                num++;
            }
            if(s.charAt(i)=='y') {
                num--;
            }

        }
        if(num != 0)  answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
