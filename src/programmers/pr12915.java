package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class pr12915 {

    public static void main(String args[]) {
        solution(new String[]{"add", "ac", "sb", "sas","sef","sze"}, 1);


    }

    // quick sort 로 풀기
    public static String[] solution(String[] strings, int n) {

    /*    String[] answer = {};
        answer = new String[strings.length];
        quickSort(strings, 0, strings.length - 1, n);

        return answer;*/


        String[] answer = new String[strings.length];

        ArrayList<String> list = new ArrayList<>();

        for(String s: strings){
            list.add(s.charAt(n)+" "+s);
        }

        Collections.sort(list);

        for (int i=0; i<strings.length;i++){
            answer[i]= list.get(i).substring(1);


        }
        return answer;

    }



    /*public static void quickSort(String[] arr, int start, int end, int n) {
        if(start>=end) return;

        int index =   partition(arr,start,end,n);

        quickSort(arr,start,index-1,n);
        quickSort(arr,index,end,n);

    }

    public static int partition(String[] arr,int start, int end,int n){


        int pivot = (start + end) / 2;

        while (start <= end) {


            while (arr[start].charAt(n) < arr[pivot].charAt(n)) {
                start++;
            }
            while (arr[end].charAt(n) > arr[pivot].charAt(n)) {
                end--;
            }


            if (start <= end) {
                String temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        return start;
    }*/


//    public static String[] solution(String[] strings, int n) {
//        String[] answer = {};
//        answer = new String[strings.length];
//        char[] chars = new char[strings.length];
//        HashMap<Character,String> map = new HashMap<>();
//
//        for(int i=0; i<strings.length;i++){
//            chars[i]= strings[i].charAt(n);
//            map.put(strings[i].charAt(n),strings[i]);
//        }
//
//        Arrays.sort(chars);
//
//        for(int i=0; i<strings.length;i++){
//            answer[i]= map.get(chars[i]);
//        }
//
//        return answer;
//    }
}
