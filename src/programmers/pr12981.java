package programmers;

import java.util.HashMap;

public class pr12981 {

    public static  void main(String[] args) {
//        solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        solution(2,new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
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
        answer[0] = 0;
        answer[1] = 0;

        HashMap<String ,Integer> map  =  new HashMap<String, Integer>();

        // 중복확인을 위한 맵 설정
        for( int i=0; i<words.length; i++){
            map.put(words[i],0);

        }
        for( int i=0; i<words.length; i++){

            // 끝말있기 일치하는지 확인

            if ( i+1 < words.length &&words[i].charAt(words[i].length()-1)!= words[i+1].charAt(0)){

                answer = getLocation(n,i+1);
            }else {


                map.put(words[i], map.get(words[i]) + 1);
                if (map.get(words[i]) > 1) {

                    // 좌표 구하기
                  answer =  getLocation(n,i);
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    // 좌표 구하기

    public static int[] getLocation(int n, int i){  // 2 / 5
        int[] result  = new int[2];
        i++;
        if (i % n == 0) {
            result[0] = i / n;
            result[1] = n;
        } else {
            result[0] = i % n;
            result[1] = i / n + 1;
        }
        return result;
    }
}
