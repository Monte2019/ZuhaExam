package math.problems;

import java.util.ArrayList;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 23};
        int x = 0;
        int i = 0;
        int[] answer = new int[1];

        for (i = 0; i < array1.length; i++) {
            int lowestDiff = array1[0]-array2[0];
            answer[0] = lowestDiff;
            for (x = 0; x < array2.length; x++) {
                int diff = array1[i] - array2[x];
                if (diff < 0) {
                    diff *= -1;
                }
                if (diff < lowestDiff) {
                    lowestDiff = diff;
                }
                for (x = 0; x < array2.length; x++) {
                    diff = array1[x] - array2[i];
                    if (diff < 0) {
                        diff *= -1;
                    }
                    if (diff < lowestDiff) {
                        lowestDiff = diff;
                    }

                }
            }
            if (lowestDiff<answer[0]){
                answer[0] = lowestDiff;
            }
            }
        System.out.println(answer[0]);
    }
}
