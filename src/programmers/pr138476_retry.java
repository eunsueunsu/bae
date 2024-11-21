package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class pr138476_retry {

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

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<tangerine.length;i++){
            if(map.containsKey(tangerine[i])){
                map.put(tangerine[i],map.get(tangerine[i])+1);

            }else{
                map.put(tangerine[i],1);
            }

        }

        int[] sizeArr = new int[map.size()];
        Iterator iter = map.keySet().iterator();
        int i=0;
        while(iter.hasNext()){
            Integer key = (Integer) iter.next();
            sizeArr[i] = map.get(key);
            i++;
        }
        Arrays.sort(sizeArr);

        int j= sizeArr.length-1;
        while(k > 0 ){
            answer++;
            k-= sizeArr[j];
            if(k < 0){
                return answer;
            }
            j--;
        }

        return answer;
    }
}
