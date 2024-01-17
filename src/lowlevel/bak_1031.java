package lowlevel;

import java.util.Scanner;

public class bak_1031 {

    public static void main(String[] args){
//양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고,
// A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        while (i-- >0){
            int n  = sc.nextInt();

            max = n > max ? n : max;
            min = n < min ? n : min;
        }

        System.out.println(max*min);
//        int length = sc.nextInt();
//        sc.next();
//        String input = sc.nextLine();
//        int result;
//        if(length>1) {
//            int fstInt = Integer.parseInt(input.substring(input.indexOf(" ")+1));
//            int lastInt = Integer.parseInt(input.substring(input.indexOf(" ")));
//            result = fstInt * lastInt;
//        } else {
//            int num = Integer.parseInt(input);
//            result =  num*num;
//        }
//
//System.out.println(result);
//        String[] strArr = new String[length];
//        strArr = input.split(" ");
//        int[] numArr = new int[length];
//        for(int i : numArr) {
//            numArr[i] = Integer.parseInt(strArr[i]);



    }
}
