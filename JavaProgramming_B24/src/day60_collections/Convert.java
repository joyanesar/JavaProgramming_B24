package day60_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Convert {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,1,4,4,5,6,7,5,6,8));
        // remove all duplicates values  // arrayslist allow duplicate

        Set<Integer> unique = new HashSet<>(nums); // set type do not allow duplicate
        System.out.println(unique);
        System.out.println();

        Set<String> obj = new HashSet<>();
        obj.add(null);
        obj.add("Hello! Hello!");
        obj.add("Nadir");
        obj.add("softskill");
        obj.add("pdf");
        obj.add("$5");
        obj.add("pdf");
        obj.add("%");
        System.out.println("Original " + obj);

        System.out.println("New  " + new  ArrayList<>(obj));


    }
}
