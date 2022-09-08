package Repil_paractice1;

import java.util.Scanner;

public class OrderMethod {
    /*
    A fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your order");
        String in = s.next();
        double price = s.nextDouble();


        String order = "";
       // double price = 0;

        if (order.equals("burgerMeal")){
            System.out.println("Price for this order is " + price);
        }else if(order.equals("chickenMeal")){
            System.out.println("Price for this order is " + price);
        }else if(order.equals("soda")){
            System.out.println("Price for this order is " + price);
        }else if(order.equals("fries")){
            System.out.println("price for this " + order + " is " + price);
        }else {
            System.out.println("Order again");
        }

    }

}