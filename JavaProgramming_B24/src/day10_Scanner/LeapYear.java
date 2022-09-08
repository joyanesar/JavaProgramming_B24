package day10_Scanner;

import java.util.Scanner;

public class LeapYear {
//    /*
//    Ask the user to enter a year.
//    Determine if the year is a leap year or not.
//    You can assume a leap year is a year that is divisible by 4. Print true or false.
//     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();

        boolean isLeapYear = year % 4 ==0;
        System.out.println(" is it Leap Year ? " + " year: "+year +" "+ isLeapYear);
//public static void main(String[] args) {
//    Scanner scan=new Scanner(System.in);
//
//    System.out.println("Enter your area code");
//    int areaCode=scan.nextInt();
//    int localNumber=scan.nextInt();
//
//    String phoneNumber  = "(" + areaCode + ")" + "-" + localNumber;;
//    System.out.println("Calling number " + "(" + areaCode + ")" + "-" + localNumber);
}

    }

