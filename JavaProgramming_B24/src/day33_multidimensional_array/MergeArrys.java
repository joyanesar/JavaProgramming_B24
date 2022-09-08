package day33_multidimensional_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArrys {
    public static void main(String[] args) {

        int[][] num = {

                {10,20,30},{5,10,15}
        };

        // task: takes the elements from the 2d array and put all the numbers into a single array.
        // Format: all elements from first , then all from the second etc..

        int size = num[0].length + num[1].length;
        System.out.println(size);
        int[] merged = new int[size]; // [10,20,30
        merged[0] = num[0][0];
        merged[1] = num[0][1];
        merged[2] = num[0][2];
        merged[3] = num[1][0];
        merged[4] = num[1][1];
        merged[5] = num[1][2];

        System.out.println(Arrays.toString(merged));


    }
}
