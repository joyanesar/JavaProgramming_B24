package day16_Switch;

import java.util.Scanner;

public class SeasonFinder {
    /*
    add new class SeasonFinder
Given some month number determine which season it is
Winter: 12,1,2
Spring: 3,4,5
Summer: 6,7,8
Fall:   9,10,11
    Ex:
    when month = 2;
        OUTPUT:
            "Winter"

    when month = 7;
        OUTPUT:
            "Summer"

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number");
        int monthNumber = input.nextInt();

        String Season = "";

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                Season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                Season = "Spring";
                break;

            case 6:
            case 7:
            case 8:
                Season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                Season = "Fall";
                break;
            default:
                System.out.println("Invalid month number given!");
        }
        if(monthNumber!=0)
        //System.out.println(monthNumber);
        System.out.println(Season);
    }
}
