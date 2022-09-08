package day10_Scanner;

import java.util.Scanner;

public class RateCaculator {
    public static void main(String[] args) {

        /*
        create a class RateCalculatorcreate a main methodcreate a Scanner
        object
        Ask the user to enter a salary (double)Print the hourly rate (double)
         of the employeeassume that one year has 52 weekshourRate = salary / (weeklyHour * 52)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHours = input.nextInt();

        double hourlyRate = salary / (weeklyHours * 52);

        System.out.println("With a salary of " + salary + " Your hourly rate for " +weeklyHours + " hours a week is " + hourlyRate);

    }
}
