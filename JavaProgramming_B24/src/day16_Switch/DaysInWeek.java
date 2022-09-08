package day16_Switch;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        /*
        Write a program that will display the given day based on a number input.
Start with 1 for Monday up to 7 for Sunday. Handle the invalid day numbers

 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter days number:");
        int day = input.nextInt();
        //int day = 7;
        String weekDay = "";

        switch (day){
            case 1: weekDay =  "Monday";break;
            case 2: weekDay =  "Tuesday";break;
            case 3: weekDay =  "Wednesday";break;
            case 4: weekDay =  "Thursday";break;
            case 5: weekDay =  "Friday";break;
            case 6: weekDay =  "Saturday";break;
            case 7: weekDay =  "Sunday";break;
            default:weekDay =  "Invalid day need to between 1 - 7";
        }
        System.out.println(day);
        System.out.println("Its " + weekDay);

    }
}
