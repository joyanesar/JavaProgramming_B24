package Repil_paractice1;

import java.util.Scanner;

public class ApartmentLeasingOffice {
    public static void main(String[] args) {
        /*
        Write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = input.nextInt();
        int startingPrice = 0;

        if (numberOfBedrooms == 1) {
            startingPrice = 600;

            System.out.println("On Bedroom Selected");
            System.out.println("Starting price: " + startingPrice);

        }else if (numberOfBedrooms == 3) {
            startingPrice = 1500;
            System.out.println("Three Bedrooms Selected");
            System.out.println("Starting price " + startingPrice);

        }else if(numberOfBedrooms == 2) {
            startingPrice = 1850;
            System.out.println("Three Bedrooms Selected");
            System.out.println("Starting price " + startingPrice);
        }else {
            System.out.println("No such Bedrooms available");
                }

            }
        }

