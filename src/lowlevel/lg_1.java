package lowlevel;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class lg_1 {


    /*
    a의 범위 , b의 범위 input

    c를 이루는 숫자가 a , b 에 모두 포함되는 숫자 쌍의 갯수 구하기


    a의 범위 포문 b 범위 포문 이중포문 돌면서

    c를 이루는지 검사



    */

    public static void main(String[] args){


        System.out.println( solutionLG(29,32));

    }

    public static int solutionLG(int num1, int num2){

        int result = 0;

        for( int i=1; i <= num1;  i++){
            for(int j=1;j<=num2;j++){

                HashSet inputSet = new HashSet<>();

                inputSet.addAll( getData(i));
                inputSet.addAll( getData(j));

                int numC= i*j ;
                HashSet resultSet =  new HashSet<>();
               resultSet.addAll(getData(numC));


               System.out.println(inputSet.contains(resultSet));
               if (inputSet.contains(resultSet)) result++;

            }
        }
        return result;
    }

    public static HashSet getData(int num){

        HashSet set = new HashSet();

        char[] chars = new char[String.valueOf(num).length()];
        chars = String.valueOf(num).toCharArray();
        for( char c : chars){
            set.add(c);
        }

        return set;
    }
}
