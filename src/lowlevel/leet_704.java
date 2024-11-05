package lowlevel;

public class leet_704 {

    public static void main(String[] args){
    search(new int[]{-1,0,3,5,9,12},9);
    }
    /*

    입력: nums = [-1,0,3,5,9,12], target = 9
 출력: 4
 설명: nums에는 9가 존재하고 인덱스는 4입니다.


    * 이진탐색
    * 배열의 가운데 값 보다 타겟이 크면 오른 쪽 탐색
    *
    * */
    public static int search(int[] nums, int target) {

     return binarySearch(nums,target,0,nums.length-1);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        int pivot = (start+end) /2;
        if( nums[pivot] == target){
            return pivot;
        }else if(nums[pivot]>target){
           return binarySearch(nums,target,start,pivot-1);
        }else{
          return binarySearch(nums,target,pivot+1,end);
        }

    }

}
