package lowlevel;

import java.util.HashSet;

public class lg_2 {

    public static void main(String[] args) {


        System.out.println(solutionLG(29, 32));

    }

    public static int solutionLG(int num1, int num2) {

        int result = 0;

        for (int i = 1; i <= num1; i++) {

            for (int j = 1; j <= num2; j++) {

                String inputStr = String.valueOf(i) + String.valueOf(j);

                int numC = i * j;

                char[] chars = String.valueOf(numC).toCharArray();
                boolean isIndex = false;
                for (Character c : chars) {
                    if (inputStr.indexOf(c) == -1) {
                        isIndex = true;
                        break;
                    }
                }
                if (!isIndex) result++;
            }
        }

        return result;
    }

}