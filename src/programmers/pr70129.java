package programmers;

public class pr70129 {

    public static void main(String[] args){

        solution("11001010101001");
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];

        // 0제거 하면서 0갯수 카운트
        // 처음 길이에서 0갯수 뺀만큼 1로 구성
        // 이진변환 횟수 카운트
        // 1이 될때까지

       answer=  binary(s,0,0);
        return answer;
    }

    public static int[] binary(String s , int zeroCnt, int transCnt){
        transCnt++;
        // 0 갯수 세기
        for(int i=0; i<s.length();i++){
            if (String.valueOf(s.charAt(i)).equals("0")){
                zeroCnt++;
            }
        }
        int[] answer = new int[2];
        // 0 제거
        s = s.replace("0","");
        int length = s.length();

        if(length<= 1){
            return new int[]{transCnt,zeroCnt};
        }else{
            String binaryString = Integer.toBinaryString(length);
            answer = binary(binaryString,zeroCnt,transCnt);
        }
       return  answer;
    }
}
