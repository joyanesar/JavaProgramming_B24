package Office_Hours;

import java.util.Arrays;

public class MergeArray2 {
    public static void main(String[] args) {

     /*

        { 1, 2, 3 }
        { 10, 20, 30}

       second case:
        output: 1, 2, 3, 10 20, 30

     */

        int[] arrOne = {1, 2, 3, 4};
        int[] arrTwo = {10, 20, 30};

        int mergedLength = arrOne.length + arrTwo.length;

        int[] merge = new int[mergedLength];

        int j = 0;//  to read arrOne value and arr two value
        for (int i = 0; i < merge.length; i++) {  // this loop goes through merge array

            merge[i++] = arrOne[j]; // i++ allow to store next position or update variable
            merge[i++] = arrTwo[j];


        }
    }
}