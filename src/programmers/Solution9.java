package programmers;

import java.util.Arrays;

public class Solution9 {

    public static void main(String[] args){

        solution("zzzzz","abc",1);

    }
    public static String solution(String s, String skip, int index) {
        String answer = "";

        /*
        * 원본 배열
        * 인덱스 만큼 검사해서 다음 알파벳으로 변경
        * */
        char[] charArr =s.toCharArray();
        for (int i=0; i<charArr.length; i++ ){
            charArr[i] =getNextChar(charArr[i],skip,index);
        }
       answer= new String(charArr);
        System.out.println(answer);
        return answer;

    }

    public static char getNextChar(char c, String skip,int index){

        for(int i=0; i < index;){
           c = nextChar(c);
            if(skip.contains(String.valueOf(c))) c = getNextChar(c,skip,index);
            i++;
        }

        return c;
    }
    public static char nextChar(char c){
        if(c=='z'){
            c = 'a';
        }
        else {
            c  = (char) (c+1);
        }
        return c;
    }
}
