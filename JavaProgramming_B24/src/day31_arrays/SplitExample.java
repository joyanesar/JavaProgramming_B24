package day31_arrays;

import Office_Hours.ArraySplitString;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SplitExample {
    public static void main(String[] args) {
//
//        String str = "monday,tuesday,wednesday";
//
//        // split up a String into a String array
//
//        String [] days = str.split(","); // by using comma string will split
//
//        System.out.println(Arrays.toString(days));
//
//        String str1 = "Jan/Feb/Mar/Apr";
//        String [] months = str1.split("/");  // remove dash it change to comma
//        System.out.println(Arrays.toString(months));
//        for(String each:months){
//            System.out.println(each);
//
//            String name = "my,name,jame,30";
//
//            String [] nam = name.split("");
//
//            System.out.println(Arrays.toString(nam));

//

        ArrayList<String>days = new ArrayList<>();
       // {"monday,tuesday,wednesday"};

        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");

        System.out.println(days);

        System.out.println(days.get(0));
        System.out.println(days.get(1)); // read the elements
        System.out.println(days.size());
        System.out.println(days.remove(0));
        System.out.println(days);




        }


    }



