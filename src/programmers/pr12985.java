package programmers;

public class pr12985 {

    public static void main(String args[]){
        solution(8,7,4);
    }
    public static  int solution(int n, int a, int b)
    {
        int answer = 0;
        // 총 몇게임
//        answer = getLog(n);

        while(true){
            if( (a+1)/2 == (b+1)/2){
                // 같은 라운드
                break;
            }else{
                a = a%2 ==0 ? a/2 : (a+1)/2;
                b = b%2 ==0 ? b/2 : (b+1)/2;
                answer++;
            }
        }

/*
*
*
* 2의 지수로만 주어져서 부전승이 없다 ?
*
*   n /2  a 와 b  모두 크거가 작으면 다시 n/2
*
* 나눈 횟수가 count
*
*
*  n / 2 해서 같은 그룹인지 검사  다른 그룹이면 지수의 승만큼의 게임 필요
*
* 같은 그룹이면 ? 지수의 승 -1 만큼 게임 필요
*
* */
        return answer;
    }

    public static int getLog(int n){
        int count = 0;
        while(n>1){
            n /=2;
            count++;
        }
        return count;
    }
    public static int changeNum(int n){
        if(n%2==0){
            return n/2;
        }else{
            return (n+1)/2;
        }
    }
}
