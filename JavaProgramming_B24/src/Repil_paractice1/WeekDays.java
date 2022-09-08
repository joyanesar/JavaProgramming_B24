package Repil_paractice1;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter  number:");
    int day = input.nextInt();
    String msg = input.nextLine();
       // int day = 5;       // Hard code one !
       // String msg = "";

        if(day ==1){
            msg = "Monday";

        }else if(day == 2){
            msg = "Tuesday";
        }else if(day == 3){
            msg = "Wednesday";

        }else if(day == 4){
            msg = "Thursday";
        }else if(day == 5){
            msg = "Friday";

        }else if(day == 6){
            msg = "Saturday";

        }else if(day == 7){
            msg = "Sunday";

        }else {
            msg = "Try again!";
        }
        System.out.println("To day is " + msg);
    }
}
