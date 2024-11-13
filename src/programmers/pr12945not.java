package programmers;

public class pr12945not {

    /*
    *  n번째 피보나치 수열 구해서 1234567로 나눠주기
    * */

    public static void main(String[] args){
        solution(100);
    }
    public static int solution(int n) {
        int answer = 0;

        long[] arr = new long[n+1];
         arr[0] = 0 ;
         arr[1] = 1;
        for(int i=2; i<=n; i++){
            arr[i]= (arr[i-1] + arr[i-2])%1234567;
        }
        answer = (int) (arr[n]);

        return answer;
    }
//    public static int fibonacci(int n){
//
//        if(n<=1){
//            return n;
//        }
//        return fibonacci(n-1)+ fibonacci(n-2);
//    }
}
