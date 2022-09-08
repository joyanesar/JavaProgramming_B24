package day24_Loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        /*
        number

        number x 1
        number x 2
        number x 3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        //int  number = 2;

        for (int i = 1; i <=10; i++){

            System.out.println(number + " x " + i + " = " +(number * i));




        }

   }

}
