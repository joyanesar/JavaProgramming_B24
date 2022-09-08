package day12_IfStatements;

import java.util.Scanner;

public class daysOfTheWeek {
    public static void main(String[] args) {
        /*

        1 - Monday
        2 - Tuesday
         ...

         7-  Sunday

         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number to find which day is this");

        int day = 1;
        String result = " ";

        if (day == 1) {
            result = "Monday";
            //System.out.println("Its monday");

        } else if (day == 2) {
            //System.out.println("Tuesday");
            result = " Tuesday";
        }else if(day ==3){
            result = "Wednesdsay";
            //System.out.println("Wednedsay");
        }else if(day==4){
            result = "Thursday";
            //System.out.println("Thursday");

        }else if(day==5){
            result = "Friday";
            //System.out.println("Friday");
        }else if(day==6){
            result = "Saturday";

            //System.out.println("Saturday");
        }else if(day==7){
            result = " Sunday";

            //System.out.println("sunday");
        }else {
            result = "Invalid number";
            //System.out.println("Its invalid number");

//            System.out.println(result);
        }
    }
}