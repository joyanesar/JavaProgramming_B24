package day35_Methods;

public class ArrayMethods {
        /*
        make a method that accepts the array . find and print the first element

        make a method that accept the array . find and print the last element

        make a method that accept the array find print  the middle element

         */
        public static void main(String[] args) {
            int[] a = {50, 4, 100, 90, 32};
                //      0  1    2   3   4
         getFirstArrayElement(a);
         getLastArrayElement(a);
         getMiddleArrayElement(a);
        }

    public static void getFirstArrayElement(int[] nums){
        System.out.println("First element: " + nums[0]);
    }

    public static void getLastArrayElement(int[] nums){
        System.out.println("Last element: " + nums[nums.length-1]); // its takes the last number
    }

    public static void getMiddleArrayElement(int[] nums){
        if(nums.length % 2 == 1){
            //ood length    12345   5/2 =2
            System.out.println("Middle element: " + nums[nums.length/2]);
        }else {
            //even length  012345   6/2  = 3
            System.out.println("First middle element: " + nums[nums.length /2]);
            System.out.println("Second middle element: " + nums[nums.length/2]);
        }

    }
}
