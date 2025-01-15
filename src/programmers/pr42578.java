package programmers;

import java.util.HashMap;
import java.util.Iterator;

public class pr42578 {

/*
* 종류별로 갯수  + 1 (입지않는 경우의수)
* 종류별 곱셈 후 -1 ( 종류가 하나일때  입지 않는 경우의 수 )
*
* */

    public static void main(String[] args){

        solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
    }
    public static int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String ,Integer> map = new HashMap<>();

        for(int i =0; i<clothes.length; i++){
            map.put(clothes[i][1],map.containsKey(clothes[i][1])? map.get(clothes[i][1])+1: 1);


        }
        answer =  map.size() > 1 ? cal(map) -1  :  clothes.length;

        return answer;
    }

    public static int cal(HashMap<String,Integer> map){

        int result=1;

        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()){

            String key = iter.next();
           int value = map.get(key)+1;
           result *= value;
        }

        return  result;
    }
}
