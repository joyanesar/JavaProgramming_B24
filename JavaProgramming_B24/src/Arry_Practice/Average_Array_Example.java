package Arry_Practice;

import java.util.Arrays;

public class Average_Array_Example {
    public static void main(String[] args) {
        /*
        Given an int array calculate the average number-> Make it flexible so
        it will work with any array size
        [1,2,3] -> average: 2[10, 15, 5, 6] ->
        average: 9[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
         */
        int[]numOne={1,2,3};
        int[]numTwo={10, 15, 5, 6};
        int[]numThree={4, 5, 6, 7, 8, 10, 20, 30, 0};

        int sum = 0; //{(numOne[0] + numOne[1] + numOne[2] / 3)};

        for(int i=0; i<numOne.length; i++){

            sum+=numOne[i];
            sum+=numThree[i];
            sum+=numTwo[i];


        }

        System.out.println(sum/numOne.length);
        System.out.println(sum/ numOne.length);
        System.out.println(sum/numThree.length);




    }
}
