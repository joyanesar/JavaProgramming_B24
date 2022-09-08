package Arry_Practice;

import java.util.Arrays;

public class StoreInventory {
    public static void main(String[] args) {

        /*

         */
        String [] items = {"Shoes","Jackets","Gloves","AirPod","Ipod","Backpack"};
        int    [] itemIds={12345,12346,12347,12348,12349,12350};
        double [] prices ={89.99,150.0,9.99,250.0,439.5,39.99};

//        System.out.println(Arrays.toString(items));
//        System.out.println(Arrays.toString(itemIds));
//        System.out.println(Arrays.toString(prices));

        for(int i=0;i<prices.length;i++){
            //System.out.println(prices[i]);
            System.out.println();
            for(double eachPrice:prices){
                System.out.println(eachPrice);

            }

        }

    }
}
