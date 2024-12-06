package programmers;

public class pr12932 {

    public static void main(String[] args) {

    }
    public int[] solution(long n) {


        int[] answer = {};

        String s = n+"";
        answer = new int[s.length()];

        int j = 0;
        for(int i=s.length()-1;i>=0 ; i--){
            answer[j] = Integer.parseInt(String.valueOf(s.charAt(i)));
            j++;
        }

        return answer;
    }
}
