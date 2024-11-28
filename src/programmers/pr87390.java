package programmers;

public class pr87390 {


    public static void main(String[] args) {

        solution(3, 2, 5);
    }

    public static int[] solution(int n, long left, long right) {
        int[] answer = {};
/*
*
 인덱스를 좌표로 변경
 * 해당 좌표에 할당된 숫자 계산 ( x,y로 계산)
*
* */
        answer = new int[(int) (right - left + 1)];
        int index = 0;
        while (true) {
            if (left > right) break;
            answer[index] = getNum(left, n);
            left++;
            index++;
        }
        return answer;
    }

    public static int getNum(Long n, int length) {

        int result = 0;

        int y = (int) (n % length);
        int x = (int) (n / length);

        if (x >= y) result = x + 1;
        else result = y + 1;

        return result;
    }

}
