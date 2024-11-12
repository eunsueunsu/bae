package programmers;

public class pr12911 {

    public static void main(String[] args){

        solution(78);
/*
*
* 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다. a*/
    }
    public static int solution(int n) {
        int answer = 0;
        int originCnt = countOne(Integer.toBinaryString(n));

        while(true){
            n++;
            String binary = Integer.toBinaryString(n);
            int binaryCnt = countOne(binary);
            if(binaryCnt==originCnt) {
                answer=n;
                break;
            }

        }

        return answer;
    }

    public static int countOne(String n){
        int count = 0;
        for(int i=0;i<n.length();i++){
           if(n.charAt(i)=='1') count++;
        }
        return count;
    }

}
