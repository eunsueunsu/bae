package programmers;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class pr131701 {

    public static void main(String args[]){

/*
* 배열에서 n 개의 값을 제거하고 더한값 구학기 i번 반복
*
*
*   총합에서 뺀값만큼 뺀 값이 구할수있는 수열의 합
*
*
* 길이가 4 인 연속 부분 수열 합
*  - >  for loop sum 에서 하나씩 제거
* 길이가 3
*  -> for loop 에서 두개씩 제거
* */

        solution(new int[]{7,9,1,1,4});
    }
    public static int solution(int[] elements) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();

        // 수열 사이즈
        for(int i=1; i<=elements.length; i++){


           // 배열 모든 원소
            for(int j =0; j <elements.length; j++) {
                int sum = 0;
                for(int index=0; index < i;index++){
                    sum+= elements[(j+index)%elements.length];
                }
                set.add(sum);
            }
        }







//        int total = Arrays.stream(elements).sum();
//        ArrayList<Integer> originArr = new ArrayList<>();
//        int total = 0;
//        for(int i : elements){
//            originArr.add(i);
//            total += i;
//        }
//        set = loop(originArr,set,total);
//        set.add(total);
//
//        for(int i =1 ; i<elements.length;i++){
//            int temp = originArr.get(i);
//            originArr.remove(i);
//            originArr.add(temp);
//            set = loop(originArr,set,total);
//        }

        return set.size();
    }

    public static HashSet<Integer> loop(ArrayList<Integer> elements, HashSet<Integer> result, int total){

        int length = elements.size();

        int sum = 0;
        for(int i = 0; i <length; i++){
            sum +=elements.get(i);
            result.add(total-sum);
        }
        return  result;
    }

}
