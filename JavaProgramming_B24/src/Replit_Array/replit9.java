package Replit_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class replit9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        System.out.println("Enter six numbers");
        int[]nums =new  int [size];
        for (int i=0; i<size; i++){
            nums[i] = input.nextInt();

        }

        //int[] nums = {6,2,5,3};

        //

        int temp = nums[0];

        System.out.println(temp);

        for(int i=0; i< nums.length -1; i++){
            nums[i] = nums[i + 1];
        }
        nums[nums.length-1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
