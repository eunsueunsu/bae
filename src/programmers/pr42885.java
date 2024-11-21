package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class pr42885 {


    /*
    * 리밋  - 최대값 보다 작은 최소값 있으면 짝짓기
    *
    *
    * */

    public int solution(int[] people, int limit) {
        int answer = 0;
        people = Arrays.stream(people).sorted().toArray();
        int min = 0;
        int j = 0;
       for(int i = people.length; i > j; i--){
           min =  limit - people[i];
           if(people[j] <= min) {
               j++;
           }
           answer++;
       }

        return answer;
    }
}
