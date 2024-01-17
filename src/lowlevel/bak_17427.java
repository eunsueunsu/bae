package lowlevel;

import java.util.Scanner;

public class bak_17427 {
    public static void main(String[] args) {
        long result = 0;
        Scanner sc = new Scanner(System.in);
        long inputNum = sc.nextInt();
        for(int i=1 ; i <= inputNum; i++){
            /*
            n의 배수는 n을 약수로 가진다
            10 까지
            1의 배수의 갯수
            2의 배수의 갯수 ...
             */
//            result += getMeasure(i);

            //o(n)
            result += (inputNum / i ) * i;
        }
        System.out.print(result);
// f(A) = 모든 약수의 합 , g(x)  =  f(a) 중 x 보다 같거나 작은
    }


    // 약수의 합 리턴   10 ->   1 , 10   2  5     1 20 2 10 4 5   / 5 4 멈춰야함
    public static int getMeasure(int originNum){
        int result = 0;
        int sqrt = ((int) Math.sqrt(originNum));

        for(int i =1 ; i <=sqrt; i++){
            if((originNum%i)==0){
                result +=i;
                    if( originNum/i != i){
                        result +=(originNum/i);
                    }
            }
        }
        System.out.println(result);
        return result;



    }
    /*
    두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다.    6= 2*3
    예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다.
    자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다.
     x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.
자연수 N이 주어졌을 때, g(N)을 구해보자.


     */

    //
}
