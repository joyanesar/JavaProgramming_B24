package Practice5;

import java.util.Scanner;

public class DaysInMonth {
    /*
    Write a program that can find the number of days in a month (Assume that Feb has 28 days) The month can be represented by a number

        28 days: 2
        30 days: 4,6,9,11
        31 days: 1,3,5,7,8,10,12

    Challenge: Recreate the program to work with String inputs of the month names
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of a month");
        String month = input.nextLine();
        String monthName = "";
        boolean is28DaysMonth = month.equals("February");
        boolean is30DaysMonth = month.equals("April") || month.equals("June") || month.equals("September") || month.equals("Novembe");
        boolean is31DaysMonth = month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") ||
                month.equals("August") || month.equals("October") || month.equals("December");

        if(month.equals("2")){
            monthName = "february";
        }else if(month.equals("3")){
            monthName = "January";
        }else if(month.equals("4")){
            monthName = "";
        }
        System.out.println(monthName);
    }
}