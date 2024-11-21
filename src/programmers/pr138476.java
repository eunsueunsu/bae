package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class pr138476 {

    public static void main(String args[]){

//        solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
    }

/*
* 순회하면서  map (size, count)
*
* max count >= k  ? return size
*
* max count < k ?
*
*
*
*
* 2.
* 정렬  -> 순회하면서 숫자가 바뀌는 인덱스 수집  (0,3)(4,6)   4, 7,
*
* 인덱스 순회하면서 사이즈 배열 생성 -> 정렬
*
*
*   수집한 인덱스 순회하면서 k 에서 빼기  k - count > 0 ?
* */
    public static int solution(int k, int[] tangerine) {
            int answer=0;
        ArrayList<Integer> indexArrList = new ArrayList<>();

        // 숫자가 변경 되는 인덱스 찾기
        Arrays.sort(tangerine);
        for(int i=0; i<tangerine.length-1; i++){
            if(tangerine[i]!=tangerine[i+1]){
                indexArrList.add(i+1);
            }
        }
        int[] sizeArr = new int[indexArrList.size()+1];
        // 인덱스 참조하여 사이즈 계산
        sizeArr[0]=indexArrList.get(0);
        // 마지막 사이즈
        sizeArr[sizeArr.length-1] = (tangerine.length+1) - indexArrList.get(indexArrList.size()-1);
        for(int i=1; i<sizeArr.length-1;i++){
            sizeArr[i]=  indexArrList.get(i) - indexArrList.get(i-1);

        }

        Arrays.sort(sizeArr);



        int i = sizeArr.length-1;
        while(k > 0){
            answer++;
            k-= sizeArr[i];
            if(k < 0){
                return answer;
            }
            i--;
        }

        return answer;
    }
}
