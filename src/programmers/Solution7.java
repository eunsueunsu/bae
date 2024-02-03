package programmers;

import java.util.*;

//도넛과 막대 그래프
public class Solution7 {

    public static void main(String args[]){

        solution(new int[][]{{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}});
    }
    public static  int[] solution(int[][] edges) {
        int[] answer = {};
        int donutCnt = 0;
        int barCnt = 0;
        int eightCnt =0;
       answer = new int[4];
        answer[0]  = edges[0][0];

//HashSet<int[]> countSet = new HashSet();
        HashMap<Integer, int[]> countMap = new HashMap<>();
        for(int i=0; i< edges.length; i++){
//            int startCnt = 0;
//            int arrivalCnt = 0;
//            int[] countArr = {startCnt,arrivalCnt};
//
//            if(edges[i][0] == answer[0]) continue;
            // 시작 카운트 더하기

            if(countMap.get(edges[i][0])!=null){
                int[] arr =  countMap.get(edges[i][0]);
                countMap.put(edges[i][0],new int[]{arr[0]+1, arr[1]});
            }else{
                countMap.put(edges[i][0],new int[]{1,0});
            }
            // 도착 카운트 더하기
            if(countMap.get(edges[i][1])!=null){
                int[] arr =  countMap.get(edges[i][1]);
                countMap.put(edges[i][1],new int[]{arr[0], arr[1]+1});
            }else{
                countMap.put(edges[i][1],new int[]{0,1});
            }



//            countMap.put(edges[i][0],countArr);
            // 정점에서 출발 하면   패스

            // 정점에서 자기한테 가면 size 1 도넛

            // 출발점 1 도착점 1  -> 8자에 쓰인 노드
        }

        Iterator<Map.Entry<Integer,int[]>> iterator = countMap.entrySet().iterator();
        while (iterator.hasNext()){
            if(iterator.next().getKey() ==answer[0]) continue;
            int[] value = iterator.next().getValue();
            if(value[0]==2 && value[1]==2)  eightCnt++;
            if(value[0]==1 && value[1]==1) donutCnt++;
            if(value[0]==0 && value[1]==1) barCnt++;
        }

        answer[1]= donutCnt;
        answer[2] = barCnt;
        answer[3] = eightCnt;


        return answer;
    }
}
/*
*
*
* [[4, 11],
*  [1, 12],
*  [8, 3],
* [12, 7],
* [4, 2],
* [7, 11],
* [4, 8],
* [9, 6],
*  [10, 11],
*  [6, 10],
*  [3, 5],
* [11, 1],
* [5, 3],
* [11, 9],
*  [3, 8]]
*
* 시작이 2번 도착도 2번 인애 -  8자
* 도착만한애 - 막대
*  시작도하고 도착도 한애 도넛
*
* */


