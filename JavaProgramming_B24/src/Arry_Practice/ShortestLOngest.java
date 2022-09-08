package Arry_Practice;

import java.util.Arrays;

public class ShortestLOngest {
    public static void main(String[] args) {

        /*
        Write a program that can return the shortest string element from a String array
         */

        String[] name = {"Nadir", "Trump","java","cate","milk", "kamilaHaris", "softSkill"};

        System.out.println(Arrays.toString(name));
        String shortest = name[0];
        String longest = name[0];


        for (String eachName : name) {

            if (eachName.length() < shortest.length()) {
                shortest = eachName;
            }
            if(eachName.length() > longest.length()){
                longest = eachName;
            }
        }
        System.out.println("shortest name is: " + shortest);
        System.out.println("Longest name is: " + longest.substring(0,1).toUpperCase()+longest.substring(1,11));
    }
}