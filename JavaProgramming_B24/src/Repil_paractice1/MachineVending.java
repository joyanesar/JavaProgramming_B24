package Repil_paractice1;

import java.util.Scanner;

public class MachineVending {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");

        int cents = input.nextInt();

        int quarters, dimes, nickels, pennies;
        String result = "";

        if (cents > 0 && cents < 100) {
            quarters = cents / 25;
            dimes = (cents % 25) / 10;
            nickels = ((cents % 25) % 10) / 5;
            pennies = ((cents % 25) % 10) % 5;
            result = "Your change is " + quarters + " quarters, " + dimes + " dimes, " +
                    nickels + " nickels, and " + pennies + " pennies";
        } else {
            result = "Invalid cents amount";
        }

        System.out.println (result);


    }
}


