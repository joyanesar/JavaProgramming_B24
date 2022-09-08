package day31_arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertName {
    public static void main(String[] args) {

    /*
    Ask the user to enter  first name
    display each character as an array
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String name = input.next();

        char[] firstName = name.toCharArray(); // String converted to arrays

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(firstName));
        //System.out.println(name.toCharArray()[0]); // it print first char of  array
        System.out.println(firstName[0]);
        System.out.println(firstName[firstName.length -1]); // it gives last index
        System.out.println(" " + firstName[0] + firstName[1]);


    }
}
