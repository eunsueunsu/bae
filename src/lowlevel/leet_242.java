package lowlevel;

import java.util.HashMap;

public class leet_242 {

    public static void main(String[] args){
isAnagram("ab","a");
    }

    /*Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true


해시맵에 오리지널 문자, 갯수 세팅

1. 검사할 값 돌면서 마이너스 시키거나 삭제
 -> 18ms

 2. sorted 후 비교

*/
    public static boolean isAnagram(String s, String t){

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for(char c : s.toCharArray() ){
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else{
               map.put(c,0);
           }
        }

        for(char c: t.toCharArray()){
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    map.put(c,map.get(c)-1);
                }else{
                    map.remove(c);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
