package day62_Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        HashMap<String,Double> inventory = new HashMap<>();
        inventory.put("milk",3.49);
        inventory.put("water",1.49);
        inventory.put("soda", 2.59);
        inventory.put("cheese",2.79);
        inventory.put("RedBull",1.99);

        System.out.println(inventory);
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String item = input.next();
        if(inventory.containsKey(item)){
            System.out.println("That item is in stock");
            System.out.println(item + " cost : " + inventory.get(item));

        }else {
            System.out.println( item + " : not available at this time!");
        }


    }
}
