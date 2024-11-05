//package company;
//
//import java.util.Arrays;
//
//public class gab1 {
//
//    public static void main(String[] args){
//
//        solution(new int[]{4,16,4,5,4});
//
//    }
//
//    public static boolean solution(int[] nums){
//
//        /*
//
//         */
//
//
//
//
//        /*
//        *  정렬
//        *  합 구하기
//        *
//        * 합에서 제일 큰수 빼서 차이 비교
//
//        33
//             /2
//        16
//
//        17
//                /2
//        8
//                /2
//        4
//
//
//         */
//
//
//        Arrays.sort(nums);
//
//        int sum = 0;
//        for(int i=0;i<nums.length;i++){
//            sum += nums[i];
//        }
//        int count = nums.length-1;
//        while(true) {
//            /*
//            * n-1번동안
//            * sum/2 인 값이 있으면 제거  sum 에서 해당값 제거
//            *
//            *
//            * */
//            if(count<0) break;
//        int curr = sum/2;
//        count--;
//        if()
//        }
//
//
//        for(int i= nums.length-1;i>0;i--){
//         if(nums[i] == sum/2) {
//             sum -= nums[i];
//         }else if()
//         }else{
//             System.out.println("false");
//             return false;
//         }
//        }
//        System.out.println("true");
//        return true;
//
//
//    }
//}
