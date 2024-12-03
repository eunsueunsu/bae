package programmers;

import java.util.Arrays;

public class pr42883 {

    public static void main(String[] args) {

        solution("23048",9);
    }
    public static String solution(String number, int k) {
        String answer = "";
        String tempStr = number;
    //"199837"

        // 1 순위의 인덱스 구하기
        // 1. 순위 인덱스 만들기
        char[] sort = new char[number.length()];

        sort[0]=0;
        for(int i=0; i<number.length(); i++){
            int rank =0;
            for(int j=0; j<number.length();j++) {
                if (number.charAt(i) < number.charAt(j)) {

                    rank++;
                }
            }
            sort[rank]=number.charAt(i);
        }
        answer = "";
        // 2. 해당 인덱스 뒤로 숫자 남는지 확인


        // 3. 재귀로 다음 인덱스 추출

        return answer;
    }

  /*  public static String cal(String number, char[] sort,int k,int start){

        char[] arr = new char[number.length()];
        arr = number.toCharArray();
        for(int i=0;i<arr.length;i++){
            if( number.indexOf(sort[i]) > k){

            }else{

            }

        }
    }*/
}
