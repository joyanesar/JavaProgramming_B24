package Office_Hours;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        /*
        {1,2,3}
        {10,20,30}

        first case
        output ; 1 ,2,3,10,20,30
         */
        int[] arrOne= {1, 2 , 3};
        int[] arrTwo= {10,20,30};

        int mergedLength =  arrOne.length + arrTwo.length;

        int[] merged = Arrays.copyOf(arrOne ,mergedLength); // copoyid

        int index = arrOne.length;

        for(int num: arrTwo){    // merged[3] = 10 merged[4] = 20 merged[5] = 40
            merged[index++] = num;
        }

        System.out.println(Arrays.toString(merged));


        }

    }

