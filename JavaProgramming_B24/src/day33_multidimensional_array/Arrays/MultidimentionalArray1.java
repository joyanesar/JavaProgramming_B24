package day33_multidimensional_array.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultidimentionalArray1 {
    public static void main(String[] args) {

        int [] a = {1,2,3};  // single dimensional
        int[]  b = { 4,5,6}; // single dimensional

        int [][] all = {a,b}; //  all means 2d array

        System.out.println(Arrays.toString(all[0])); // print the first of 2d of the array
        System.out.println(Arrays.toString(all[1])); // print the second 2d of array elements
        System.out.println(all.length);
        System.out.println(Arrays.deepHashCode(all)); // to print all whole 2d element arrays

        int[] c = {7,8,9};
        int[] d = {10,11,12};
        int[][] two = {c,d};

        System.out.println(Arrays.deepToString(two));



    }
}
