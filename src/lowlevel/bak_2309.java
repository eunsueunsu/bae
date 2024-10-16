package lowlevel;

import java.util.Arrays;
import java.util.Scanner;

public class bak_2309 {


    public static void main(String[] args){

        solution();
    }

    public static void solution(){

        Scanner sc = new Scanner(System.in);

        int[] inputArr = new int[9];

        for(int i=0; i<inputArr.length; i++){
            inputArr[i] = sc.nextInt();
        }

        Arrays.sort(inputArr);

        int num1=0;
        int num2=0;
        for(int i = 0; i<inputArr.length; i++){
            for(int j= 9; j>=0; j--){
                if(i==j) break;
                int result = 0;
                for(int p=0; p<inputArr.length; p++){
                    if(p != i && p != j) {
                        result += inputArr[p];
                    }

                }
                if(result==100){
                    num1 = i;
                    num2 =j;
                    break;
                }
            }
        }
        for(int i=0; i<inputArr.length; i++){
            if (i != num1 && i!= num2){
                System.out.println(inputArr[i]);
            }

        }



    }
}
