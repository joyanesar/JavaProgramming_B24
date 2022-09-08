package Repil_paractice1;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number:");
        int number = input.nextInt();

        String monthName = "";

        if(number == 1){
            monthName = "January";

        }else if(number == 2){
            monthName = "February";

        }else if(number == 3) {
            monthName = "April";
        }else if(number == 4){
            monthName = "March";

        }else if(number == 5){
            monthName = "May";

        }else if(number == 6){
            monthName = "June";
        }else if(number == 7){
            monthName = "July";

        }else if(number == 8){
            monthName = "Aug";

        }else if(number == 9){
            monthName = "Sep";

        }else if(number == 10){
            monthName = "Oct";

        }else if(number == 11){
            monthName = "Nov";

        }else if(number == 12){
            monthName = "Dec";
        }else {
            monthName = "Invalid entry!";
        }

        System.out.println(monthName);

    }
}
