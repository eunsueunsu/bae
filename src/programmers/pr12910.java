package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pr12910 {

    public static void main(String[] args) {

    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){

           if( arr[i]%divisor == 0 ) list.add(arr[i]);

        }
        if(list.size()==0) {
            answer = new int[1];
            answer[0]= -1;

        }else{
          Collections.sort(list);
            answer = new int[list.size()];
            for(int i =0; i<answer.length;i++){
                answer[i]= list.get(i);

            }
        }

        return answer;
    }
}
