package Office_Hours;

import java.util.Arrays;

public class MissingNumbers {
    /*

    get an array of numbers from 1 - 9

    [1,2,4,5,6,7,8,9]

    find the missing number
   int[] num = {1,4,2,9,6,7,8,5};
    -> 3

     */
    public static void main(String[] args) {
        System.out.println(findMissingNumber(1,4,2,9,6,7,8,5));
    }
    public static int findMissingNumber(int ... nums){

        Arrays.sort(nums);
        int checking = 1;

        for(int each: nums){
            if(checking != each){
            break;
            }
            checking++;
        }

       return checking;


    }

}
