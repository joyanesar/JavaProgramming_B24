package day41_arrayList;

import Office_Hours.ArraySplitString;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        nums.remove(0);
        //nums.remove(700); this way is not working

        Integer a = 700;  //first by making object to remove method
        nums.remove(a);
        nums.remove(new Integer(900)); // second way to creat object then remove method


        System.out.println(nums);





    }
}
