package day33_multidimensional_array.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {


        int[] num = {40, 2, 55, 7, 88, 60};

        //Arrays.binarySearch() It shows the position of arrays!
        System.out.println(Arrays.toString(num));

        System.out.println(Arrays.binarySearch(num,40));
        System.out.println(Arrays.binarySearch(num,55));
        System.out.println(Arrays.binarySearch(num,88));
        System.out.println(Arrays.binarySearch(num,60));


    }
}