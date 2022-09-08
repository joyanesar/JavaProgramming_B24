package day09_Scanner_Logical;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        /*
        180 - triangle
        360 - circle
        3 angles
         */

        Scanner keyboard = new Scanner(System.in);
        int angleCounter = 1;


        System.out.println("Enter angle " + angleCounter++);
        double angleOne = keyboard.nextDouble();

        System.out.println("Enter angle " + angleCounter++);
        double angleTwo = keyboard.nextDouble();


        System.out.println("Enter angle " + angleCounter++);
        double angleThree = keyboard.nextDouble();

        double sum = angleOne + angleTwo + angleThree;
//        boolean isTriangle = angleOne + angleTwo + angleThree == 180;

//        boolean cirCle = angleOne + angleTwo + angleThree == 360;
        boolean isTriangle = sum == 180;
        boolean isCircle   = sum == 160;

        System.out.println("Is a triangle " + isTriangle);
        System.out.println("Is a Circle " + isCircle);






    }
}
