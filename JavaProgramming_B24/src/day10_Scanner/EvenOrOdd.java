package day10_Scanner;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
        Ask the user to enter an int number, print if the number is even or odd as boolean values
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        long number = input.nextLong();

        boolean isEven = number % 2 == 0;
        System.out.println(number+ "is even " + isEven);

        boolean isOdd = number % 2 !=0;
        System.out.println(number+ "is odd " + isOdd);


    }
}
