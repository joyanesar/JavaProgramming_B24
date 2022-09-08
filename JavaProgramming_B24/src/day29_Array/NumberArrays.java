package day29_Array;

import java.util.Arrays;

public class NumberArrays {
    public static void main(String[] args) {


        int [] ages = {25,15,32,12,52,20,40,15,25};

        System.out.println(ages.length);
        System.out.println(ages[7]);
        System.out.println(Arrays.toString(ages));

        double [] scores = {90.3,80.13,40.50,19.9,100.0,50};
        //                   0    1     2     3    4     5
        System.out.println(scores.length);
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0] + scores[1]);
        System.out.println(scores[2] + scores[5]);







    }
}
