package programmers;

public class pr12980 {

    public static void main(String[] args){

        solution(5000);
    }

    /*
   k칸 점프
   현재온만큼 순간이동
     1, 2, 4  , 8

     2, 4. 8.
     3, 6  12
     4 8 16


 5 10 20 40

Math.sqrt -> 제곱근 리턴
 n  + n 제곱 만큼 꽁짜 이동

 루트 구하기 / 나머지가 가장 작은 루트 연산 구학기


         n / 2
         25
    * */

        public  static int solution(int n) {
            int ans = 0;


            while(n>0){
                if(n % 2 ==0 ){
                    n /= 2;
                }else{
                    n = (n-1)/2;
                    ans++;
                }
            }


            return ans;
        }
}
