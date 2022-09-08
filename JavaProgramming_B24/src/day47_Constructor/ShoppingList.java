package day47_Constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Items firstItem = new Items("Pineapple" , 5, 2.55);
        System.out.println(firstItem);
        firstItem.quantity =50;
        firstItem.calculatePrice();
        System.out.println(firstItem);
        firstItem.unitPrice = 2.99;
        firstItem.calculatePrice();
        System.out.println(firstItem);
        firstItem.name = "pepsiPack";
        firstItem.unitPrice = 3.85;
        firstItem.calculatePrice();
        System.out.println(firstItem);
        System.out.println(firstItem.unitPrice);

        String keepingGoing = "yes";
        ArrayList<Items> shoppingList = new  ArrayList<>();


        while (keepingGoing.equalsIgnoreCase("yes")) {
            System.out.println("What is the item name");
            String name = input.nextLine();

            System.out.println("What is the quantity ?");
            int quantity = input.nextInt();
            System.out.println("What is the unit price ?");
            double unitPrice = input.nextDouble();

            Items item = new Items(name, quantity, unitPrice);
            shoppingList.add(item);

            System.out.println("Do you want to keep adding items?");
            input.nextLine(); // empty enter input

            keepingGoing = input.nextLine();
        }
        System.out.println("\nShopping List: ");
        System.out.println(shoppingList);


        }

    }
