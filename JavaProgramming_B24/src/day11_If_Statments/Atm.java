package day11_If_Statments;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to the Atm *** ");
        System.out.println("Please enter your passcode");

        int inputPassCode = input.nextInt();
        int validPassCode = 1234;

        if(inputPassCode == validPassCode){
            // valid  logged in
            System.out.println("logged in!");
            System.out.println("Select a number");
            System.out.println("\t1) Check balance");
            System.out.println("\t2) Deposit");
            System.out.println("\t3) Withdraw");
            int selection = input.nextInt();

            System.out.println(selection);

            if(selection==1) {
                System.out.println("Your balance is $" + 1_000_000);
            }
            if(selection == 2){
                System.out.println("Enter your bills in the slot");
            }
            if(selection == 3 ){
                System.out.println("Take your money and dont come back!");
            }


        }else {
            System.out.println("Invalid passCode");
            System.out.println("Try agian");
        }





    }
}
