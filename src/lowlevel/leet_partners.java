package lowlevel;

import java.util.HashMap;
import java.util.Stack;

public class leet_partners {

    public static void main(String[] args){

        isValid("((");
    }

    public static boolean isValid(String s) {

        Stack<Character> input = new Stack<>();
        char[] arr = new char[s.length()];
        if(s.length()%2 >0) return false;
        arr = s.toCharArray();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(int i=0; i<s.length(); i++){
            if(map.containsValue(arr[i])){
                // 오프닝이면 스택에 넣고
                input.push(arr[i]);
            }else{
                // 엔딩이면 직전 스택 빼서 짝 검사
                //
                if(input.empty()){
                    return false;
                }else{
                    if(input.pop()!=map.get(arr[i])){
                        return false;
                    }
                }
            }
        }

        return input.empty();
    }
}
