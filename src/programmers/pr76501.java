package programmers;

public class pr76501 {

    public static void main(String[] args){



    }


        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 123456789;

            /*


            for(int i=0; i<absolutes.length; i++){

               answer =  signs[i] ?  answer + absolutes[i] : answer - absolutes[i];

            }

             */

            // 가독성 버전
            for(int i=0; i<absolutes.length; i++){

                answer += absolutes[i] * ( signs[i]  ? 1:-1);

            }

            return answer;
    }
}
