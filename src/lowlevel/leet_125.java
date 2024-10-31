package lowlevel;

import java.util.Locale;

public class leet_125 {

    public static void main(String[] args) {

        solution("race a car");
    }

    public static boolean solution(String s) {

        boolean result = true;


        s=  s.toLowerCase();
        s=  s.replaceAll("\\W|\\s+|[_]","");

        char[] input = new char[s.length()];
        input = s.toCharArray();

        int backward = s.length()-1;
        int forward = 0;
        if (s.equals("")) return result;
        while(backward>forward){


            if(  input[backward]!=input[forward]){
                result = false;
            }
            backward--; forward++;
        }
        return result ;
    }
}
