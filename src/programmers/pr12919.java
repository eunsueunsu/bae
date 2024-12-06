package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pr12919 {

    public static void main(String[] args) {

    }

    public String solution(String[] seoul) {
        String answer = "";

        int index=0;
        for(String s : seoul){

            if(s.equals("Kim")){
            break;
            }
            index++;
        }
        answer = "김서방은 "+ index +"에 있다";
        return answer;
    }
}
