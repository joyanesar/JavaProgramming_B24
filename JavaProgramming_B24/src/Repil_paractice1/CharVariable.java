package Repil_paractice1;

import java.util.Scanner;

public class CharVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = input.next().charAt(0);
        String msg = " " ;

        if(response == 'y'){
            msg = "Your request is being processed";

        }else if(response == 'n'){
            msg = "Thank you anyway for your consideration";
        }else if(response == 'h'){
            msg = "Sorry, no help is currently available";
        }else {
            msg = "Invalid entry, please try again!";
        }
        System.out.println(msg);
    }
}
