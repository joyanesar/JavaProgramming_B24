package Chalanges_question;

import java.util.Scanner;

public class ChalangeOne {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter 5 numbers and returns the maximum number

write a program that asks user to enter 5 numbers and returns the minimum number

write a program that asks user to enter 5 numbers and returns the minimum and maximum numbers

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int nu1 = input.nextInt();
        System.out.println("enter second number");
        int nu2 = input.nextInt();
        System.out.println("enter third number");
        int nu3 = input.nextInt();
        System.out.println("enter fourth number");
        int nu4 = input.nextInt();
        System.out.println("enter fifth number");
        int nu5 = input.nextInt();
        int maximumNumber = 0;

        if(maximumNumber < nu1){
            maximumNumber++;

        }

            System.out.println("maximum number is " + maximumNumber);
        }

    }
