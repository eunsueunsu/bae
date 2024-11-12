package programmers;

import java.util.Locale;

public class pr12951 {

    public static void main(String[] args) {
        solution("3people   unFollowed me");
    }

    // jadenCase
    // 공백뒤의 알파벳이면서 공백이나 숫자가 아니면은 대문자 , 나머지는 소문자
    public static String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        boolean isBeforeBlank = true;
        for (int i = 0; i < s.length(); i++) {
            if ( isBeforeBlank) {
                String str = String.valueOf(chars[i]).toUpperCase();
                answer += str;
                isBeforeBlank = false;
            } else {
                String str = String.valueOf(chars[i]).toLowerCase();
                answer += str;
            }
            if (chars[i] == 32) {
                isBeforeBlank = true;
            } else {
                isBeforeBlank = false;
            }
        }
        return answer.toString();
    }
}
