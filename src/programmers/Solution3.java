package programmers;


import java.util.HashMap;

// 추억 점수
public class Solution3 {


   public static void main(String[] args){
       String[] name = {"may", "kein", "kain", "radi"};
       int[] yearning = {5, 10, 1, 3};

       String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

       int[] answer = solution(name,yearning,photo);
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        answer = new int[photo.length];
        // 점수 맵 만들기

        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
        for(int i=0; i < name.length; i++){
            scoreMap.put(name[i],yearning[i]);
        }
        // 2차원 배열 포문
        for(int i=0; i< photo.length; i++){
            for( int j=0; j <photo[i].length; j++){
              answer[i] += scoreMap.get(photo[i][j]) == null ? 0 : scoreMap.get(photo[i][j]);
            }
        }
            //내께 젤 깔끔 ㅋ

        return answer;
    }
}
