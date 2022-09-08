package day15_statements;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {

        /*
        Coffee
        tall,grande,venti
        price
        calories
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Starbucks:");
        System.out.println("Which size would you like?");
        String size = input.next();
        //double price = input.nextDouble();
        //int calories = input.nextInt();

        double price = 0;
        int calories = 0;
        boolean validOrder = true;

        switch (size) {
            case "tall || short || small":
                price = 3.5;
                calories = 100;
                break;
            case "grande":
                price = 4.5;
                calories = 150;
                break;
            case "venti":
                price = 6.59;
                calories = 200;
                break;
            default:
                System.out.println("Try agian");
                validOrder = false;

        }
        if (validOrder) {

            System.out.println("your order was " + size);
            System.out.println("Total price is " + price);
            System.out.println("Total calories " + calories);
        }
    }
}