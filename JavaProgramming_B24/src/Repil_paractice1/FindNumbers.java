package Repil_paractice1;

import java.util.Scanner;

public class FindNumbers {
    public static void main(String[] args) {
        /*
        Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.

         */

        Scanner input =new Scanner(System.in);
        System.out.println("Enter first number:");
        int numberOne = input.nextInt();
        System.out.println("Enter second number:");
        int numberTwo = input.nextInt();
        System.out.println("Enter third number:");
        int numberThree = input.nextInt();


        if(numberOne > numberTwo && numberOne < numberThree){
            System.out.println("Medium value is: " + numberOne);
        }else if(numberTwo > numberOne && numberTwo < numberThree){
            System.out.println("Medium value is:" + numberTwo);
        }else {
            System.out.println("Medium value is: " + numberThree);
        }



    }
}
