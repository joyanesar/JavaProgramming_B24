package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);

        nums.addAll(Arrays.asList(3,5,1,2,5));
        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(10, 20 , 30));

//        nums.add(other.get(0)); // get the first element and added
//        nums.add(other.get(1));

//        nums.addAll(other);
//        other.addAll(nums);
        nums.addAll(0,other);



        System.out.println(nums);
        System.out.println(other);

        //These 2 lines only removes the first 5
        //Integer five = 5;
        //nums.remove(five);

        nums.removeAll(Arrays.asList(5 , 10)); // this code removes all 5 and if added any number will be removed
        // from the list
        System.out.println(nums);

        // what if you try to remove an element that is not your Arraylist
        System.out.println(nums.removeAll(Arrays.asList(30)));




    }
}
