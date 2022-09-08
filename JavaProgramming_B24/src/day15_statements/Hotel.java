package day15_statements;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java hotel");
        System.out.println("How many number of people in your party?");
        int numberOfPeople = input.nextInt();
        System.out.println("How many days will you stay?");
        int numberOfDays = input.nextInt();

        double price = 0;
        String roomType = "";
        boolean validPartySize = true;
        String  peopleMsg = "people";
        switch (numberOfPeople) {
            case 1:
                roomType = "Single";
                price = numberOfDays * 100;
                peopleMsg = "person";
                break;
            case 2:
                roomType = "DoubleRoom";
                price = numberOfDays * 150;
                break;
            case 3:           // no need to write code we need the same price or rooms
            case 4:           // when the value is 3 or 4 it runs the same code above
                roomType = "LargeRoom";
                price = numberOfDays * 175;
            case 5:
            case 6:
                roomType = "Suite";
                price = numberOfDays * 305;
                break;
            default:
                System.out.println("Sorry ! no room available");
                validPartySize =false;

        }

        if (validPartySize) {
            System.out.println("Okay great, for " + numberOfPeople + peopleMsg + numberOfDays + " people staying for " + numberOfDays + " days " + "your total price is :  $ " + price + " for a " + roomType);
        }


    }

}