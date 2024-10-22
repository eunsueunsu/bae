package lowlevel;

import java.util.Arrays;
import java.util.Scanner;

public class bak_1759 {

    static String[] output ;
    public static void main(String[] args){




        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c = sc.nextInt();

        String[] inputArr = new String[c];

        for (int i=0; i<c; i++) {
            String s = sc.next();
            inputArr[i] = String.valueOf(s.charAt(0));
        }

        Arrays.sort(inputArr);
        output = new String[l];
        combi(inputArr, 0,0, c,l);


//        Scanner sc = new Scanner(System.in);
////        String num = sc.nextLine();
//        String num = "4 6";
//        int l = Integer.parseInt(num.substring(0,1));
//        int c = Integer.parseInt(num.substring(2,3));
//
////        String input = sc.nextLine();
//        String input = "a t c i s w";
//        char[] inputArr = new char[c];
//        inputArr = input.replace(" ","").toCharArray();
//
//        Arrays.sort(inputArr);
//        System.out.println(inputArr.toString());
//        boolean[] visited= new boolean[c];
//        combi(inputArr,visited,0,0,c,0,l);

    }


    public static void combi(String[] inputArr, int count, int start, int c, int l){

        String gat = "aeiou";
        if(count==l){
            int ja=0;
            int mo=0;
           for(int i=0;i<output.length;i++){
               if(gat.contains(output[i])){
                   mo++;
               }else{
                   ja++;
               }

           }
           if(mo >= 1 &&  ja >= 2){
               print();
           }
            return;
        }

        for(int i = start; i<c; i++){
            output[count]= inputArr[i];
            combi(inputArr,count+1,i+1,c,l);

        }

    }


    public static void print(){

        for(int i = 0; i< output.length; i++){

                System.out.print(output[i]);

        }
        System.out.println();
    }
}
