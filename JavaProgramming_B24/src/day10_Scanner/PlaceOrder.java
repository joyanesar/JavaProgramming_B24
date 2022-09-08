package day10_Scanner;

import java.util.Scanner;

public class PlaceOrder {
    /*
    Ask the user the enter the product name (String, multiple words)Ask the user to enter the price (double)Ask the user to enter the quantity(int)Ask the user to enter their full name (String, multiple word)Print in the following format:"$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String  productName = input.nextLine();

        System.out.println("Enter the product price");
        float price = input.nextFloat();

        System.out.println("Enter the Quantity");
        int quantity = input.nextInt();

        input.nextLine(); // empty line need here

        System.out.println("Enter Full your Name");
        String fullName = input.nextLine();

        System.out.println(fullName + " your order for " + quantity + " " +productName + " has been placed "+" Your Total cost is $ " +(float)(price*quantity));


    }
}
