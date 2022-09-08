package day23_do_loop;

import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int validPin = 1235;
        int userPin;
        int attempts = 0;

        do{
            System.out.println("Enter your pin");
            userPin = input.nextInt();
            attempts++;

        }while (attempts < 3 && userPin != validPin);

        if(userPin == validPin){
            System.out.println("Welcome , your logged in");
        }else {
            System.out.println("Locked out , Too many attempts");
        }
    }
}
