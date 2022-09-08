package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class NewFixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine().trim().toLowerCase();

        System.out.println("Enter your lastName");
        String lastName = input.nextLine().trim().toLowerCase();

      //  System.out.println(firstName);
        //System.out.println(lastName);
                                                   // (0,) means 1 not included
        String fixedFirstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        String fixedLastName   = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(fixedFirstName + " " +fixedLastName);

    }
}
