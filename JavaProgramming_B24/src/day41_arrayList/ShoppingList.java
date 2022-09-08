package day41_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); // capacity is internal
//        System.out.println(" size " + list.size()); // size how many element there right now zero
//        System.out.println(list.isEmpty());

        Scanner input = new Scanner(System.in);
        //System.out.println("Enter your shopping list:");
        if (list.isEmpty()) {
            System.out.println("You should add something to your list");
        } else {
            System.out.println("Your list has some things");
        }
        String keepingAsking = "";
        do {
            System.out.println("What do you want to add to your list ?");
            String item = input.nextLine();
            list.add(item);

            System.out.println("Do you want to add another item");
            keepingAsking = input.nextLine();
        } while (keepingAsking.equalsIgnoreCase("yes"));

        System.out.println("This is your shopping list: " + list);
        System.out.println("Size after adding items:" + list.size());


        if (list.isEmpty()) {
            System.out.println("You should add something to your list");
        } else {
            System.out.println("Your list has some things");
        }
        System.out.println("Do you want to remove anythings?");
        String wantToRemove = input.nextLine();

        if(wantToRemove.equals("yes")){
            System.out.println("what do you want to remove");

            list.remove(input.nextLine());
        }
        System.out.println("This is your shopping list: " + list);
        System.out.println("Size after removing items " + list.size());

    }
}