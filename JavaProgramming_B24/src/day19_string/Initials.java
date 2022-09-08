package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    /*
    Ask the user enter the first name
    ask the user enter the lastname
    then print the initials
         James Bond _>


         Bonus : give the initials as uppercase !

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = input.next();
        System.out.println("Enter lastName");
        String lastName = input.next();

        String  initials = " " + firstName.charAt(0) + lastName.charAt(0);

        System.out.println(initials.toUpperCase());


        }


    }

