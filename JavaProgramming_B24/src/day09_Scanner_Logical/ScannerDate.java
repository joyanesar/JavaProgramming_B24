package day09_Scanner_Logical;

import javax.swing.plaf.SeparatorUI;
import java.util.Scanner;

public class ScannerDate {
    public static void main(String[] args) {

        /*
        Ask the user to enter the month number
        Ask the user to enter the day number
        Ask the user to enter year number

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month Number");
        int month = input.nextInt();

        System.out.println("Enter the day Number");
        int day = input.nextInt();

        System.out.println("Enter the Year Number");
        int year = input.nextInt();

        System.out.println(month+ "/" + day + "/" + year);

    }
}
