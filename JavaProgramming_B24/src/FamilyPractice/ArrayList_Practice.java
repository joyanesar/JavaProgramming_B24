package FamilyPractice;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice {
    public static void main(String[] args) {

//        ArrayList<Integer> nums = new ArrayList<>();
//
//        nums.add(25);
//        nums.add(29);
//        nums.add(24);
//        nums.add(13);
//        nums.add(14);
//        System.out.println(nums.get(0));
//        System.out.println(nums.get(nums.size() - 1));
//
//        nums.set(1, 15);
//
//        System.out.println(nums);
//        System.out.println(nums.size());
//
//        nums.remove(0);
//        System.out.println(nums);
//
//        Integer a = 15;
//
//        System.out.println(nums.remove(a));
//        System.out.println(nums);
//
//        ArrayList<Integer> list = new ArrayList<>(nums);
//
//        list.add(75);
//        System.out.println(list);
//
//
//


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal","shortcut"));


        ArrayList<String> list3 = new ArrayList<>();
        for(String each : list2){

            if(each.length() <= 4){
                list3.add(each);
            }

        }
        System.out.println(list3);

    }
}
