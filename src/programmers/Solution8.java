package programmers;

import java.sql.Array;

//크기가 작은 부분문자열
public class Solution8 {
    public static void main(String[] args){
        solution("0000349","10109");
    }
    public static int solution(String t, String p) {
        int answer = 0;
        int numCount  = t.length()-p.length()+1;
        int num=0;
        int numLength = p.length();
        long longP = Long.parseLong(p);
        for(int i=0; i < numCount ; i++){
        if(  Long.parseLong(t.substring(i,i+numLength))<= longP) answer++;
        }

        return answer;
    }

}
