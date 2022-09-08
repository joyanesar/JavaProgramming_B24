package Repil_paractice1;

import java.util.Scanner;

public class positiveNegative {
    /*
    Given int num check if the number is positive, negative, or zero

Hint: use 3 if statements to do this
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > 0){
            System.out.println(" is positive");

        }else if(num <0){
            System.out.println(" is negative");
        }else{
            System.out.println(" is zero");
        }
    }
}
