package programmers;

public class pr12977 {


    private static int answer;

    public static void main(String[] args) {

        solution(new int[]{1,2,3,4});
    }
    public static int solution(int[] nums) {



        boolean[] bArr = new boolean[nums.length];
        int c = 0;
         combi(bArr, nums, nums.length, 0, 3);
        return answer;
    }

    public static void combi(boolean[] visited, int[] nums, int n, int index, int count) {
        int result = 0;
        if (count == 0) {

            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    result += nums[i];
                }
            }

            if (isDivided(result)) answer++;
        } else {

            for (int i = index; i < n; i++) {
                visited[i] = true;
                combi(visited, nums, n, i + 1, count - 1);
                visited[i] = false;
            }

        }

    }

    public static boolean isDivided(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}