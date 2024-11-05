package lowlevel;

public class leet_733 {


    public static void main(String[] args) {

        floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1,1,2);

    }

    /*
     * 시작 픽셀과 같은 값이면서 수평 또는 수직으로 인접해 있는 경우 주어진 숫자로 색깔 체인지~!
     *
     *
     * 주어진 주소와 인접한 2차원 배열 구현
     * 인접한지 ? 주어진 값에서 같거나 -1 , +1
     * 일치하면 색 업데이트
     *
     *
     *[[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
     * 가운데 색 업데이트 -> 4방면 업데이트 -> 4방면 업데이트
     * 조건 : 범위를 벗어나지 않게
     *  주어진 색깔과 현재 색깔이 일치하면 리턴
     * 첫칸의 색깔과 일치하는지 비교
     *
     * */
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {


//        int[][] arr = new int[image.length][image[0].length];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if ((sr - 1) == j || sr == j || j == (sr + 1)) {
//                    // 인접한곳 체크
//                    if (image[i][j] == sr) {
//                        arr[i][j] = color;
//                    }
//                }
//            }
//            if ((sc - 1) == i || sc == i || i == (sc + 1)) {
//                if (image[i][0] == sr) {
//                    arr[i][0] = color;
//                }
//            }
//        }
//        return arr;
        if(image[sr][sc] == color) return image;
        changeArr(image,sr,sc,color,image[sr][sc]);

        return image;

    }

    public static void changeArr(int[][] image, int sr, int sc , int color, int start){

        if(sr<0|| sc <0|| sr>image.length||sc>image[0].length) return;

        if(image[sr][sc]!=start) return;

        image[sr][sc]= color;


        changeArr(image,sr-1,sc,color,start);
        changeArr(image,sr,sc-1,color, start);
        changeArr(image,sr+1,sc,color, start);
        changeArr(image,sr,sc+1,color, start);


    }
}