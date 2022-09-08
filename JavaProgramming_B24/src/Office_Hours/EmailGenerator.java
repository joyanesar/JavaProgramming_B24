package Office_Hours;

import java.util.Arrays;
import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {

        /*
        ask how many email they / want to make it

        Ask the user to enter last name
           > all lowercase

           ask the user to enter the firstName
            .... first letter uppercase , the rest lowercase

            ..... first three letters of the first name


            ask the user to enter their favorite number
                 > the number * last name length

                 last name + .first name + number + gmail

                 store the emails into an array

         */


        Scanner input = new Scanner(System.in);
        System.out.println("how many emails do want to generate?");
        int size = input.nextInt();

        String [] emails = new String[size];

        for(int i=0;i<emails.length;i++){
            System.out.println("Enter your last name:");
            String lastName = input.next().toLowerCase();

            System.out.println("Enter your first name:");
            String firstName = input.next().toLowerCase();
            firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1,3);

            System.out.println("Enter your favorite number");
            int favNum = input.nextInt() * lastName.length();

            emails[i] = lastName + " . " + firstName + favNum + "@gmail.com";




        }
        System.out.println(Arrays.toString(emails));

    }
}
