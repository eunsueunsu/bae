package programmers;

// 공원 산책
public class Solution5 {


    public static void main(String[] args) {

//        solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
//        solution(new String[]{"SOO","OXX","OOO"} , new String[]{"E 2", "S 2", "W 1"});
        solution(new String[]{"OSO","OOO","OXO","OOO"} , new String[]{"E 2","S 3","W 1"});
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        answer = new int[2];
        // 현재 위치
        int currentI = 0;
        int currentJ = 0;
        int moveI = 0;
        int moveJ = 0;
        int maxI = park.length-1;
        int maxJ = park[0].length()-1;
        String[][] parkArr = new String[maxI+1][maxJ+1];
        for (int i = 0; i < park.length; i++) {

            for (int j = 0; j < park[i].length(); j++) {

                if (String.valueOf(park[i].charAt(j)).equals("S")) {
                    currentI = i;
                    currentJ = j;
                }
                parkArr[i][j] = String.valueOf(park[i].charAt(j));
            }

        }

        // 거리가 되는지 확인


        // 장애물이 있는지 확인

        // s를 옮기기
        for (int i = 0; i < routes.length; i++) {
            int moveNum =0;
            boolean isStop = false;
            switch (routes[i].charAt(0)) {
                case 'E':
                    isStop = false;
                    moveNum = currentJ + (routes[i].charAt(2)- '0');
                    if(moveNum <= maxJ) {
                        for (int x = currentJ; x < moveNum; x++) {
                            if (parkArr[x][currentJ].equals("X")) {
                                isStop = true;

                                break;
                            }
                        }
                        if (!isStop) currentJ = moveNum;
                    }
                        break;

                case 'W':
                     isStop = false;
                    moveNum = currentJ - (routes[i].charAt(2)- '0');
                    if(moveNum >=0) {
                        for (int x = currentJ; x > moveNum; x--) {
                            if (parkArr[currentI][x].equals("X")) {
                                isStop = true;
                                break;
                            }
                        }
                        if (!isStop) currentJ = moveNum;
                    }
                    break;

                case 'N':
                     isStop = false;
                    moveNum = currentJ - (routes[i].charAt(2)- '0');
                    if ( moveNum >= 0) {
                        for (int x = currentJ; x > moveNum; x--) {
                            if (parkArr[currentI][x].equals("X")) {
                                isStop = true;
                                break;
                            }
                        }
                        if (!isStop) currentI = moveNum;
                    }
                    break;

                case 'S':
                     isStop = false;
                    moveNum = currentI + (routes[i].charAt(2)- '0');
                    if(moveNum <= maxJ) {
                        for (int x = currentI; x < moveNum; x++) {
                            if (parkArr[x][currentJ].equals("X")) {
                                isStop = true;
                                break;
                            }
                        }
                        if (!isStop) currentI = moveNum;
                    }
                    break;


            }

        }
        // 현재 위치
        answer[0] = currentI;
        answer[1] = currentJ;
        return answer;
    }

    public static boolean isStop(String value){
        return value.equals("X");
    }

}
