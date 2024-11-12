package programmers;

import java.util.Arrays;

public class pr12941 {

    public static void main(String[] args){

    }
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");


        // 각 배열의 최소값 * 최대값 누적 시켜서 리턴

        Arrays.sort(A);
        Arrays.sort(B);

        int start = 0;
        int end = A.length-1;

        while (start < A.length){

           answer+= A[start]*B[end];
           start++;
           end--;
        }


        return answer;
    }
}

