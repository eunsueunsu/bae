package lowlevel;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class bak_2309 {

/*
*
*
* 20
7
23
19
10
15
25
8
13*/
    public static void main(String[] args){

        solution2();
    }

    public static void solution2(){
        Scanner sc = new Scanner(System.in);

        int[] inputArr = new int[9];

        for(int i=0; i<inputArr.length; i++){
            inputArr[i] = sc.nextInt();
        }

        Arrays.sort(inputArr);
        boolean[] visited = new boolean[9];
        combination(inputArr, visited,9,7,0,0);





    }
    static boolean isBreak = false;
    public static void combination(int[] inputArr, boolean[] visited ,  int total, int count, int index, int sum) {


        if(count == 0 ){
//           System.out.println(Arrays.toString(visited));
            if ( sum == 100 ){

                isBreak = true;
                print(inputArr,visited);
                return;
            }
            sum = 0;
            return ;

        }
    // combination(inputArr, 9 , 7,0)
        for (int i = index; i<total; i++) {


            visited[i] = true;
            sum += inputArr[i];
           if(!isBreak) combination(inputArr, visited, total, count - 1, i + 1 , sum);
            sum -= inputArr[i];
            visited[i] = false;
        }
    }

    public static void print(int[] arr, boolean[] visited){

        for(int i=0; i<arr.length; i++){
           if(visited[i]) System.out.println(arr[i]);
        }
    }

//    public static void solution(){
//
//        Scanner sc = new Scanner(System.in);
//
//        int[] inputArr = new int[9];
//
//        for(int i=0; i<inputArr.length; i++){
//            inputArr[i] = sc.nextInt();
//        }
//
//        Arrays.sort(inputArr);
//
//        int num1=0;
//        int num2=0;
//        for(int i = 0; i<inputArr.length; i++){
//            for(int j= 9; j>=0; j--){
//                if(i==j) break;
//                int result = 0;
//                for(int p=0; p<inputArr.length; p++){
//                    if(p != i && p != j) {
//                        result += inputArr[p];
//                    }
//
//                }
//                if(result==100){
//                    num1 = i;
//                    num2 =j;
//                    break;
//                }
//            }
//        }
//        for(int i=0; i<inputArr.length; i++){
//            if (i != num1 && i!= num2){
//                System.out.println(inputArr[i]);
//            }
//
//        }
//    }
}
