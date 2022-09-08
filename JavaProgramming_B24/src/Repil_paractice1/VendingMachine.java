package Repil_paractice1;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userMoney, quarters,dimes,nickles,pennies;
        System.out.println("Enter a cents");
        int cents = scan.nextInt();

        quarters = cents / 25 ;
        cents %= 25;
        dimes = cents / 10; // 8 /10
        cents %= 10;       // 8 % 10 > 8
        nickles = cents / 5; // 8 /5 -> 1 | 8 -5 => 3
        cents %= 5;      // 3
        pennies = cents;


        if(cents >0 && cents < 100){
            System.out.println("Your change is " + quarters + "," + dimes +"," + nickles + ", and "+ pennies);
        }else {

        }
        System.out.println("Invalid cents amount");
    }
}
