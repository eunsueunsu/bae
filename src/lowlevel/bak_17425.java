package lowlevel;

import java.util.Scanner;

public class bak_17425 {

    /*
    두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다.
     예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다. 자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고,
      f(A)로 표현한다. x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.

자연수 N이 주어졌을 때, g(N)을 구해보자.
     */
    public static void main (String[] args){

        /*
        N 까지 모든 자연수의 약수의 합 구하기

        1~n 까지의 합 : n(n+1) /2
         */
        Scanner sc = new Scanner(System.in);
        Long inputNum = sc.nextLong();
        int result = 0;
        for(int i =0; i<=inputNum; i++ ){
            result += ( inputNum / i) * i;
            //
               Long bCount = inputNum/i;  // 배수의 갯수
           result += (bCount*(bCount+1)/2 ) * i; // 배수들의 합

        }
 System.out.println(result);

    }

}
