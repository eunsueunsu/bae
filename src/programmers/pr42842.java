package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class pr42842 {

    public static void main(String[] args){

        solution(10,2);
    }
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;

        for(int w = sum-1; w > 0; w--){

            if(sum%w !=0) continue;

            int h = sum/w;
            int yellowSize = (w-2) * (h-2);
            int brownSize = sum-yellowSize;

            if( yellowSize==yellow && brownSize ==brown){
                answer[0]=w;
                answer[1]=h;
                break;
            }
        }
return answer;

 /*       br = (a*b) - ye
        br + ye = a*b

         yellow =   (x-2) * (y-2)

       yellow -> 24로 주어졌을때 가로세로   - 가로가 더 길다
      2 12
      3 8
      4 6




yellow 의 최대 세로길이 =  brown의 최소 세로길이




yellow size limt 구하기


        a >2 b >2*/


    }
}
