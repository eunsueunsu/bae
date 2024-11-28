package programmers;

public class pr12949 {

    public static void main(String[] args) {

        /*행렬의 곱셈*/

        solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}});
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
//  앞 행 뒤 열
        answer =  new int [arr1.length][arr2[0].length];

        for(int i=0; i<answer.length;i++){

            for(int j =0; j< answer[0].length; j++){

                answer[i][j]= getNum(i,j,arr1,arr2);
            }
        }

        return answer;

    }

    public static int getNum(int a, int b,int[][] arr1, int[][] arr2){
        int result =0;
        for(int i=0; i<arr2.length;i++){
            result += arr1[a][i] * arr2[i][b];
        }
        return result;
    }

}
