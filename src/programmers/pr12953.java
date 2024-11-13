package programmers;

public class pr12953 {

    /*
    *
    * 최소공배수  = a*b / 최대공약수
    *
    * a 와 b의 최대 공약수 구하기?
    * 20 15     27, 5   5, 2
    *
    * clear
    *
    *
    *
    * */

    public static void main(String[] args){

 solution(new int[]{1,2,3});
    }
    public static int solution(int[] arr) {
        int answer = 0;
        answer= arr[0];
    for(int i=1; i<arr.length; i++){
        answer= (answer*arr[i]) / getGCD(answer,arr[i]);
    }
        return answer;
    }

    // 두수의 최대 공약수
    public static int getGCD(int a, int b) {
        return a%b!=0 ? getGCD(b,a%b) : b;

    }
}
