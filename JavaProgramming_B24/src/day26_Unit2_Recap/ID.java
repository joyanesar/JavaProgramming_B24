package day26_Unit2_Recap;

import java.util.Scanner;

public class ID {
    public static void main(String[] args) {
        /*
        Create ID [String]

Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine()
                                   .trim().
                                  toLowerCase();
        System.out.println("Enter your last name");
        String lastName = input.nextLine()
                                   .trim()
                                 .toLowerCase();

        String id = " "+  firstName.charAt(0);
             //           firstName.substring(0);
         id +=lastName.substring(0,1).toUpperCase() + lastName.substring(1,3); // this we want only first character upper

        id += firstName.length() * 2;

        System.out.println("Id generated: " + id);


    }
}
