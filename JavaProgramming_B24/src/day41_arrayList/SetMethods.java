package day41_arrayList;

import java.util.ArrayList;

public class SetMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums =  new ArrayList<>();


        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        // how do you change a value / element
        //arr[index] = value


       // nums.add(0,1000);
        nums.set(0, 1000);
        System.out.println(nums);
        nums.set(3 , -2000);
        System.out.println(nums);
//        nums.set(0 , 5000);
        System.out.println(nums.set(1,90));
        System.out.println(nums);

        System.out.println(nums.set(1, 300));
        System.out.println(nums);



        }

    }

