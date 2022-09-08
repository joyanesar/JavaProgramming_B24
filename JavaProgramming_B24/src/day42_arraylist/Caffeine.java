package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        /*
        ArrayList of caffeinated drinks

        figure out how much caffeine each drink has, and store that into a new ArrayList
   coffee - 80
        tea - 50
        monster - 100
        red bull - 100
        coke - 70
        pepsi - 70
        bang - 100
        apple juice - 0


         */
        //This is all the defined information to work with
        String [] allDrinks = {"coffee", "tea", "monster", "red bull", "coke", "pepsi", "bang", "apple juice"};

        ArrayList<String> drinksList = new ArrayList<>(Arrays.asList(allDrinks));
        // Array to ArrayList to make an Arraylist with value right away
        ArrayList<Integer> caffeineAmounts = new ArrayList<>();
        //This for each loop goes through element and puts the caffeine amount into the other ArrayList

        for (String eachDrink: drinksList){
            int caffeineNum = 0;

            switch (eachDrink){
                case "apple juice":
                    caffeineNum =0;
                    break;
                case "tea":
                    caffeineNum =50;
                    break;

                case "coke":
                case "pepsi":
                    caffeineNum = 70;
                    break;
                case  "coffee":
                    caffeineNum =80;
                    break;
                case "monster":
                case "red bull":
                case "bang":
                    caffeineNum = 100;
                    break;
                            }
            caffeineAmounts.add(caffeineNum); // actual adding of the caffeine number to the arraylist
        }

//        System.out.println(drinksList);
//        System.out.println(caffeineAmounts);


        // printing the drinks and caffeine amounts together
        System.out.println("==============Finished Table ===============");

        for(int i =0; i < drinksList.size(); i++){
            System.out.println("Drink: " + drinksList.get(i));
            System.out.println("Caffeine amount: " + caffeineAmounts.get(i));
            System.out.println();
        }
    }
}
