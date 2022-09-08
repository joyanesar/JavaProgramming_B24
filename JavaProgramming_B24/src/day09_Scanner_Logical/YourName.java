package day09_Scanner_Logical;

import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        /*

        Ask the user to enter their first name
        Ask the user to enter their last name

        use next() -> reads only a single word
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");

        String  firstName = input.nextLine();

        System.out.println("Enter your last name");

        String lastName = input.nextLine();

        System.out.println("My name is " + firstName + " and  last name is " +lastName);
    }
}
