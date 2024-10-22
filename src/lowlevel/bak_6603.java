package lowlevel;

import java.util.Scanner;

public class bak_6603 {


    public static void main(){

        Scanner sc = new Scanner(System.in);


        while(true){

            String input = sc.nextLine();
            input.replace(" ","");
            int length = Integer.parseInt(input.substring(0,1));

            int[] arr = new int[length];

            for(int i=0; i>length;i++){

                arr[i]= input.indexOf(i);




            }

            if( input.equals("0")) break;

        }




    }
}
