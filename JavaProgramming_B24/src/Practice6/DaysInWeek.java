package Practice6;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
/*

Write a program that will display the given day based on a number input.
Start with 1 for Monday up to 7 for Sunday. Handle the invalid day numbers

 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of a day");
        int number = input.nextInt();
        String day = "";

        switch (number) {
            case 1: day = "Monday";break;

            case 2: day = "Tuesday";break;


            case 3: day = "Wedensday";break;

            case 4:day = "Thursday";break;


            case 5:day = "Friday";break;


            case 6:day = "Saturday";break;


            case 7:day = "Sunday";break;


            default:
                System.out.println("Invalid day numbers!");

        }

        System.out.println("It is " + day);




















    }
}
