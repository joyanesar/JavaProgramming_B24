package day40_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<String > groupOne = new ArrayList<>(); // default value is 10 for ArrayList
        System.out.println(groupOne);
        System.out.println(groupOne.size());
        groupOne.add("Nadir");
        groupOne.add("sam");
        groupOne.add("jame");
        groupOne.add("bond");

        System.out.println(groupOne);
        System.out.println(groupOne.get(0));

//        System.out.println("First element " + groupOne.get(0)); // To get the first element of the ArrayLIst
//        System.out.println("First element " + groupOne.get(1));
//        System.out.println("First element " + groupOne.get(2));
//        System.out.println("First element " + groupOne.get(3));
//        System.out.println("First element, first char: " + groupOne.get(0).charAt(0)); //First element first letter.
//

        // capacity example
        ArrayList<String> groupTwo = new ArrayList<>();
        System.out.println(groupTwo.size());

        ArrayList<String > groupThree = new ArrayList<>();
        groupThree.add("Nisso");
        groupThree.add(0,"Nadir"); // Nadir got first position
        groupThree.add("kamila");
        groupThree.add(1,"Dildora");// Nadir still on his first position
        groupThree.add(3,"Anna");
        System.out.println(groupThree);

        ArrayList<Integer> num = new ArrayList<>();

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(4,1,5,2,6,3,96,36));


        num.add(10);
        num.add(21);
        num.add(35);
        num.add(44);
        num.add(45);
        num.add(32);



        }






    }
