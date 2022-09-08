package day31_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StoreInformaiton_Arrays {
    public static void main(String[] args) {


        String [] items =  {"Shoes","Jackets","Gloves","AirPod","Ipod","Backpack"};
        double [] prices = {89.99, 150.0, 9.99, 9250.0, 439.5, 39.99};
        int    [] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};


        // Find out if the store has jackets

        boolean hasJackets = false;

        for(String eachItem: items){


            if(eachItem.equals("Jackets")){
                hasJackets =true;
                break;
            }

        }
        if(hasJackets){
            System.out.println("yes we have jackets, do you want it ?");
        }else {
            System.out.println("No sorry! we dont have jacket right now , still summer here !");
        } // print all the information
        // item id | name | price
        for (int i=0; i<items.length;i++){
            System.out.println(itemIds[i] + " | " + items[i] + " | " + prices[i] + "$" );

            System.out.println();

        } //Find the information of the most expensive items

        double maxPrice = prices[0];
        int indexOfMax = 0;

        for (int i=0;i<prices.length;i++){

            if(prices[i] > maxPrice){
                maxPrice =prices[i];
                indexOfMax = i;
            }
        }

        System.out.println("The mosts expensive items : ");
        System.out.println("Item id : " + itemIds[indexOfMax]);
        System.out.println("name " + items[indexOfMax]);
        System.out.println("price :" + prices[indexOfMax]);
    }
}
