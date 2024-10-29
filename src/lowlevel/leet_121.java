package lowlevel;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class leet_121 {

    public static void main(String[] args) {

        solution(new int[]{4, 1, 2});
    }

    public static int solution(int[] prices) {

// 이윤 저장 비교해서 높은 값으로 업데이트

        /*
         *  i 값 설정 - i 보다 큰수 만 남기기?
         * 최대값 빼기 최소값
         *
         * 근데 최소값이 앞에 있어야 함
         *

         *
         * */

    int result = 0;

    int current = prices[0];
    for(int i=1; i<prices.length; i++) {

        if (prices[i] - current < 0) {
            current = prices[i];
        } else {

            result = Math.max(result, prices[i] - current);
        }
    }
    return result;
    }
}