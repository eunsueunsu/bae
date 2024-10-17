package lowlevel;

public class Combi {

    public static void main(String[] args){


    }

    public static void combi(int[] arr, boolean[] visited, int start,int total,  int count){

        if ( count == 0) {
            return;
        }
        for( int i = start ; i < total ; i ++){
            visited[i] = true;
            combi(arr,visited,i+1,total,count-1);
            visited[i] = false;
        }

    }
}
