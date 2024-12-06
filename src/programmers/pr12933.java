package programmers;

import java.util.Arrays;

public class pr12933 {

    public static void main(String[] args) {

    }

    public long solution(long n) {
        long answer = 0;

        String s = n+"";
        char[] arr = new char[s.length()];
      arr=   s.toCharArray();
        Arrays.sort(arr);

        String answerStr = "";
        for(int i=arr.length-1;i >=0; i--){
            answerStr += arr[i];
        }
            answer = Long.parseLong(answerStr);
        return answer;
    }
}
