package day29_Array;

import java.util.Arrays;
public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] prices =  new double[5]; // making an object that
        System.out.println(Arrays.toString(prices));

        prices[0] = 15.59;
        System.out.println(Arrays.toString(prices));
    // reasinging value for each elements / size
        prices[1] = 21.5;
        prices[2] = 31.5;
        prices[3] = 45.2;
        prices[4] = 52.22;
        System.out.println(Arrays.toString(prices));

        // reassigne index of the array to 2000.5
        prices[2] = 2000.52;
        prices = new double[2];

        //System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(prices));

        String [] str = {"java"};
        System.out.println(Arrays.toString(str));
        str [0] = "Saturday";
        System.out.println(Arrays.toString(str));








    }
}
