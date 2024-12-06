package programmers;

public class pr12943 {

    public static void main(String[] args) {
solution(626331);
    }


    /*
    *
    * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
    * */
    public static int solution(int num) {
        int answer = 0;
        if( num==1) return answer;
        long lnum = (long)num;
        while(true){

            lnum =   lnum%2==0 ?  lnum/2 :  lnum*3+1;
            answer++;

            if(lnum==1 ) break;

            if(answer == 500){answer = -1;  break;}
        }

        return answer;
    }

}
