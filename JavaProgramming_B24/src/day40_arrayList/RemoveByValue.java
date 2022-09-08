package day40_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveByValue {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("pen");
        list.add("keyboard");
        list.add("monitor");
        list.add("jamesBond");


//        list.remove("keyboard");// this is another way to remove element
//
//        System.out.println(list);
//
//        boolean removed2 = list.remove("hat");
//        System.out.println(removed2);
//        System.out.println(list);


        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(25);
        nums.add(35);
       // System.out.println(nums);
        nums.remove(5);
       //  nums.remove(35);
        System.out.println(nums);
        System.out.println(nums.size());

    }
}
