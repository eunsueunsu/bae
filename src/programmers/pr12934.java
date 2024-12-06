package programmers;

public class pr12934 {

    public static void main(String[] args) {

        solution(3);
    }

    public static long solution(long n) {
        long answer = -1;
        double num = 0;
        num = Math.sqrt(n);

        if(num > 0 && num % 1 ==0.0) {
            answer = (long) (num +1);
            answer = answer * answer;
        }

        return answer;
    }
}
