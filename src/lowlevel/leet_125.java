package lowlevel;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

public class leet_125 {

    public static void main(String[] args) {

        solution("race a car");
    }

//    public static boolean solution(String s) {
//
//        boolean result = true;
//
//
//        s=  s.toLowerCase();
//        s=  s.replaceAll("\\W|\\s+|[_]","");
//
//        char[] input = new char[s.length()];
//        input = s.toCharArray();
//
//        int backward = s.length()-1;
//        int forward = 0;
//        if (s.equals("")) return result;
//        while(backward>forward){
//
//
//            if(  input[backward]!=input[forward]){
//                result = false;
//            }
//            backward--; forward++;
//        }
//        return result ;
//    }

    // 정규식 사용 안하기
    // 졍규식 빼면 15초 개선

    public static boolean solution(String s) {



        int forward = 0;
        int backward = s.length()-1;

        while( forward < backward){

            char cf  = s.charAt(forward);
            char cb = s.charAt(backward);
            if(!Character.isLetterOrDigit(cf)){
                forward++;
            }else if(!Character.isLetterOrDigit(cb)){
                backward--;
            }else{

                if(Character.toLowerCase(cf)!=Character.toLowerCase(cb)){
                    return false;

                }else{
                    forward++;
                    backward--;
                }
            }
        }

        return true;
    }



}
