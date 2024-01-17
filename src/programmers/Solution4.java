package programmers;

import java.util.HashMap;

// 달리기 경주
public class Solution4 {
    public static void main(String[] args){

        String[] a = solution(new String[]{"mumu", "soe", "poe", "kai", "mine"},new String[]{"kai", "kai", "mine", "mine"});
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        answer = new String[players.length];
        HashMap<String,Integer> playerKeyMap = new HashMap<>();
        HashMap<Integer,String> rankKeyMap = new HashMap<>();

        for(int i=0; i< players.length; i++){
            playerKeyMap.put(players[i],i);
            rankKeyMap.put(i,players[i]);

        }
        for(int i=0; i< callings.length; i++) {
//            playerMap.get(callings[i]);


          int currentRank =  playerKeyMap.get(callings[i]);
            String fowardPlayer = rankKeyMap.get(currentRank-1);


          playerKeyMap.put(callings[i],currentRank-1);
          rankKeyMap.put(currentRank-1,callings[i]);
          playerKeyMap.put(fowardPlayer,currentRank);
          rankKeyMap.put(currentRank,fowardPlayer);

        }
        for(int i=0; i< players.length; i++) {

            answer[i]= rankKeyMap.get(i);
        }
            return answer;
    }
}
