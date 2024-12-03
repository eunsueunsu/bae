package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class pr42747 {
    public static void main(String[] args) {

    }
    public int solution(int[] citations) {
        int answer = 0;
       int highQuotCount=0;
       int lowQuotCount=0;


       /*
       *  정렬 후 h 인덱스 찾기
       *
       * h
       *[0] 0
[3, 4] 2
[1, 2, 3, 5, 6, 7, 10, 11] 5
[3, 5, 11, 6, 1, 5, 3, 3, 1, 41] 5
[1, 11, 111, 1111] 3
       * [0,1,3,5,6] h
       * */

//       for(int i=0; i<citations.length;i++){
//
//
//           if()
//       }

        Arrays.sort(citations);

       int index=0;
        while(true){

            if(citations.length-index == answer) break;
            if(answer>citations[index]) index++;

            answer++;


        }

        return answer;
    }
}
