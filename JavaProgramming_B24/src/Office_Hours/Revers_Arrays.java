package Office_Hours;

import java.util.Arrays;

public class Revers_Arrays {
    public static void main(String[] args) {
        /*
        Reverse ArrayGiven an int array reverse the elements’ orderEx: Input: { 1, 2, 3, 4 }Output: { 4, 3, 2, 1 }Challenge:Reversetheelementswithoutmakinganew array
         */
        int[] nums = {1,2,3,4};
        int[] reversed = new int[4];

        int j =0;

        for(int i=nums.length -1; i >= 0;i--){   // .length - 1 always give you the last index
            //reversed[j] =nums[i];
            System.out.println(nums[i]); // nums of i is 4,3,2,1
            reversed[j++] = nums[i];

        }
        System.out.println(Arrays.toString(reversed));

    }
}
