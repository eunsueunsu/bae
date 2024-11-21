package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class pr12981 {

    public static  void main(String[] args) {

//        solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
//        solution(2,new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
//        solution(3,new String[]{"abc", "cbd", "ddd", "ddd", "dbc", "cbd"});
//        solution(2,new String[]{"kick","kick"});
        solution(2,new String[]{});

    }

    /*
    * 이차원 배열에 담기 ?
    *
    * 이차원 배열에서 같은 값인놈 찾기 ?
    *
    * 해시맵에 key : string , value 좌표 할당 ?
    *
    * 맵 key : string , v : 중복 여부 int
    *
    * 중복 숫자가 크면 좌표 리턴
    *
    *
    * 7번째다 ?
    *
    *
    *
    * 다시다시
    *
    * 1.끝말있기인지 확인 - 2. 중복인지 확인
    *
    * */

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0]=0;
        answer[1]=0;
        ArrayList<String> arrayList = new ArrayList<>();

        if(words.length < 1) return answer;
        arrayList.add(words[0]);
        for( int i =1; i< words.length; i++){
            String before = arrayList.get(i-1);
            if(!arrayList.contains(words[i]) && before.charAt(before.length()-1)==words[i].charAt(0)){
                arrayList.add(words[i]);
            }else {
              answer= getLocation(n,i);
              return answer;
            }


        }

     return  answer;
    }

    // 좌표 구하기

    public static int[] getLocation(int n, int i){  // 2 / 5     2 / 2
        int[] result  = new int[2];
            result[0]= i%n+1;
            result[1]= i/n+1;

        return result;


    }
}
