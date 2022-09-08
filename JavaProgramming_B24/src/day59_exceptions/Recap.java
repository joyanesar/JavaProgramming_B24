package day59_exceptions;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 5};
        try {
            //int[] num = {3, 5, 1, 5}; we need take out otherwise ist not work
            System.out.println(nums[2]); // valid case
            System.out.println(nums[10]); // invalid case

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("That was invalid index");
            System.out.println(nums[10]);

        }finally {
            System.out.println("Done");
        }
        System.out.println(Arrays.toString(nums));

    }
}
