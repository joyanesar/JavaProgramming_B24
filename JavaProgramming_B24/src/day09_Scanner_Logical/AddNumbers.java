package day09_Scanner_Logical;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three Numbers");


        int one = scan.nextInt();
        int two = scan.nextInt();
        int three = scan.nextInt();

        String msg = one + " + " + two + " + " + three + " = ";

        System.out.println(msg+(one + two + three));


    }
}
