package programmers;

import java.util.Arrays;

public class pr12939 {

    public static void main(String[] args){

        solution("1 2 3 4");
//        solution("-1 -2 -3 -4");
    }
    public static  String solution(String s) {
        String answer = "";

        String[] input = s.split(" ");
        int[] intArr = new int[input.length];
        for ( int i=0; i <input.length; i++){
            intArr[i]= Integer.parseInt(input[i]);

        }
        Arrays.sort(intArr);

        System.out.println( intArr[0]+" "+ intArr[input.length-1]);
        return intArr[0]+" "+ intArr[input.length-1];
    }
}
