package day04_variables;

public class Fruits {
    public static void main(String[] args) {
//
        int apples = 10;
        int grapes = 10;
        int bananas = 10;
        System.out.println("Number of apples: " + apples);
        System.out.println("Number of grapes: " + grapes);
        System.out.println("Number of bananas:" + bananas);

        int totalNumberOfFruits = apples + grapes + bananas;
        System.out.println("totalNumberOfFruits = " + totalNumberOfFruits);
//    soutv -> shortcut to print variables
//    we got new shipment and then  we have 50 apples
        apples = 50; // reasigned and count agian
        totalNumberOfFruits = apples + grapes + bananas;
        System.out.println("After shipment");
        System.out.println("Number of apples: " + apples);
        System.out.println("Number of grapes: " + grapes);
        System.out.println("Number of bananas:" + bananas);
        System.out.println("totalNumberOfFruits = " + totalNumberOfFruits);

    }
}