package day39_wrapper_arraylist;

import java.util.Scanner;

public class ParseExample {
    public static void main(String[] args) {
        //converting the String characters to a number

        String year = "2009";

        int intYear = Integer.parseInt(year);

        System.out.println(intYear);
        System.out.println(year);

        System.out.println(year + 1);
        System.out.println(intYear + 1);

        /*
        Ask the user to enter some text
        I am x years old

        int 5 years you will be: $age
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = input.nextLine();// when we have multi line we need to use nextLine



       // System.out.println("In 5 years you will be " + (age + 5));

        String priceStr = "112.99";  // converting String to double, we need to parsmethod
        double priceInt = Double.parseDouble(priceStr);
        System.out.println(priceInt);


        String lunchBreakTime = "1.5";
        double   breakTimeStartInt = Double.parseDouble(lunchBreakTime);

        System.out.println("Our lunch break starts at " + breakTimeStartInt + " clock");


        String s = "50";
        Integer i = Integer.valueOf(s);
        int i2 = Integer.valueOf(s);
        System.out.println(i);
        System.out.println(i2);




    }
}
