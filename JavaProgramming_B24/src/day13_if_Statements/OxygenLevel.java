package day13_if_Statements;

import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {
        /*
        You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level

Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you oxygen level");
        // int oxygenLevel = 80
        int oxygenLevel = scan.nextInt();
        String message = "";

        if (oxygenLevel >= 90) {
            message = " your tank is full";

        } else if (oxygenLevel >= 80) {
            message = "Still okay";

        } else if (oxygenLevel >= 70) {
            message = "Dont go too far";
        } else if (oxygenLevel >= 60) {
            message = " Start to head back";
        } else if (oxygenLevel >= 50) {

            message = "Be Careful now you are at 50%";
        } else {
            message = "Below 50%";



            if (oxygenLevel >= 50 && oxygenLevel < 60) {
                message = "Be Careful now you are at 50%";
            } else if (oxygenLevel >= 60) {
                message = " Starts to head back";

            }


        }
        System.out.println(message);
    }
}