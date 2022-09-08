package day10_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        input.nextLine(); // accepts the enter input from the line above

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your address");
        int address= input.nextInt();

        System.out.println("Enter your zipcode");
        int  zipCode = input.nextInt();

        System.out.println(fullName);
        System.out.println(number);
        System.out.println(address);
        System.out.println(zipCode);

        //



    }
}
