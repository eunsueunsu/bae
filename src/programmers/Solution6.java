package programmers;

public class Solution6 {

public static void main(String args[]){
    solution("banana");
}

    public static int solution(String s) {
        int answer = 0;

        int equalCnt = 0;
        int nonEqualCnt = 0;
        int divideCnt = 0;
        char[] chars = s.toCharArray();
        char firstChar = chars[0];
        boolean isStart = false;


        for(int i =0;i < s.length(); i++){


            if(isStart){
                firstChar = chars[i];
                isStart = false;
            }
           if( chars[i]== firstChar) {
               equalCnt++;
           } else{
               nonEqualCnt++;
           }
            if(equalCnt == nonEqualCnt){
                divideCnt++;
                isStart = true;
            }
           if(i==s.length()-1 && equalCnt != nonEqualCnt) divideCnt++;
        }
        // char array 로 변환
        // /*
        // 포문 돌면서 x랑 같은지 확인
        // */
        answer = divideCnt;
        return answer;
    }
}