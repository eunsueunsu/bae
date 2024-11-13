package programmers;

import java.util.Stack;

public class pr12973 {

    public static void main(String[] args){

/*
* 알파벳 짝짓기
*
* baabaa   bbaa  aa
*
* 순서 보장 , 삭제
*
*
* 배열 순회해서 짝찾기 ?
*
* 삭제한 배열 다시 전달해서 짝찾기 재귀 실행
*
* 같은 짝 인덱스만 알아내서 스트링에서 해당 인덱스만 제거하기
*
* 스택으로 풀기
*
* */
    }
    public static int solution(String s)
    {
        int answer = -1;

        Stack<String> stack = new Stack<>();
        stack.push(String.valueOf(s.charAt(0)));
        String nowStr = "";
        for(int i=1; i<s.length(); i++){
            nowStr = String.valueOf(s.charAt(i));
            if(!stack.isEmpty()&&stack.peek().equals(nowStr)){
                stack.pop();
            }else{
                stack.push(nowStr);
            }
        }
        if(!stack.isEmpty()) answer= 0;
        return answer;
    }



}
