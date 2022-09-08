package day33_multidimensional_array.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxNumberFrom2D {
    public static void main(String[] args) {

        // 2d int array
        // find the biggest number from the whole

        int[][] nums = {
                {4, 5, 40, 1400, 1409, 12},
                {200, 3000, 3940},
                {10, 200, 40}
        };

        int max = nums[0][0];

        for (int[] eachArray : nums) {
            for (int eachNumber : eachArray) {

                if (eachNumber > max) {
                    max = eachNumber;
                    Arrays.sort(eachArray);
                }
            }
            System.out.println(Arrays.toString(eachArray));
        }

        System.out.println(" max " + max);
    }
}