package day10_Scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        /*
        Ask the user to enter product price and quantity
        and then calculate the revenue. revenue = price Ã quantity.Â
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product price");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int    quantity = scan.nextInt();


        float revenue = (float)(price * quantity);


        System.out.println("Revenue is " + revenue);

    }
}
