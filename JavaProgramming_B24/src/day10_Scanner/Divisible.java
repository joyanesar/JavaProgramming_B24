package day10_Scanner;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
    /*
     Ask the user to enter a number.
    Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values
    */
        Scanner key = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = key.nextInt();
        boolean isDivisibleBy2 = number % 2 ==0;
        boolean isDivisibleBy3 = number % 3 ==0;
        boolean isDivisibleBy5 = number % 5 ==0;
        System.out.println(number+"is divisible by 2" +isDivisibleBy2);
        System.out.println(number+"is divisible by 3" + isDivisibleBy3);
        System.out.println(number+"is divisible by 4" + isDivisibleBy5);


    }
}
