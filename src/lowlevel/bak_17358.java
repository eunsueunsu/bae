package lowlevel;

import java.util.Scanner;

public class bak_17358 {

    public static void main(String[] args) {


        solution();


    }
    public static void solution(){

        Scanner sc = new Scanner(System.in);
        Long input  = Long.valueOf(sc.nextInt());

        Long result = 1L;

        while (true){
            result *= input -1;

            result = result%(1000000000+7);
            input -= 2;

            if(input ==2 ) break;
        }

        System.out.println(result);



    }

}