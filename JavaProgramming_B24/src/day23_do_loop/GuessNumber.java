package day23_do_loop;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*
        there is a number predefined

        we want the user to guess


        80

        ->50
             50 is too small
             ->90
                90 is too big
         */
        Scanner input = new Scanner(System.in);

        int secretNumber = 80;
        int userGuess;
        int attempts =0;

        do {
            System.out.println("Guess a number");
            userGuess = input.nextInt();
            attempts++;


            if (userGuess > 0 && userGuess <= 100) {

                if (userGuess == secretNumber) {
                    System.out.println("Good guess ! The number was " + secretNumber);

                } else if (userGuess < secretNumber) {
                    System.out.println(userGuess + " Too small number");

                } else if (userGuess > secretNumber) {
                    System.out.println(userGuess + " Too big number");
                }

                } else {
                    System.out.println("Invalid number , need to be between 1-100");
                }


            } while (userGuess != secretNumber) ;


            if(attempts <= 2){
                System.out.println("really good guess");


            }else if(attempts <= 4){
                System.out.println("still good guess");
            }else {
                System.out.println("a lot of gussess but you got it");
            }

        }
    }

