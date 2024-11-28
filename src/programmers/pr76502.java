package programmers;

import java.util.HashMap;
import java.util.Stack;

public class pr76502 {

    /* 괄호 회전하기
    *
    *         // 순회 - 시작값이 end괄호이면 Continue
        // else - 스택에 담고 다음값과 짝이 맞으면 제거
        // 남은 값이 없으면 success case
    * */
    public static void main(String[] args) {
        solution("}]()[{");
    }

    public static int solution(String s) {
        int answer = 0;

        String end = ")}]";

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        // end를 키로 갖는 map의 value 와 비교
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<Character>();
            if (end.contains(String.valueOf(s.charAt(i)))) continue;
            stack.push(s.charAt(i));
            for (int j = 1; j < s.length(); j++) {
                char next = s.charAt((i + j) % s.length());
                if (stack.empty()) {
                    stack.push(next);
                } else if (map.get(next) == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(next);
                }
            }
            if (stack.empty()) answer++;
        }

        return answer;
    }
}
