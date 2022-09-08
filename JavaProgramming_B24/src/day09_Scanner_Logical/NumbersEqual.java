package day09_Scanner_Logical;

import java.util.Scanner;

public class NumbersEqual {
    public static void main(String[] args) {

        /*
        Ask the user to enter 2 numbers
        and check if the numbers are equal

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number one");
        double numberOne = scan.nextDouble();


        System.out.println("Enter number two");
        double numberTwo = scan.nextDouble();


        System.out.println(numberOne + "is equal to " + numberTwo + " : " + (numberOne == numberTwo));




    }
}
