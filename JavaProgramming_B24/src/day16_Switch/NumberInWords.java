package day16_Switch;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
       /* Write a program that will display the given day based on a number input.
        Start with 1 for Monday up to 7 for Sunday. Handle the invalid day numbers
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        String numberInWord = "";

        switch (number){
            case 1:numberInWord = "One"; break;

            case 2: numberInWord = "Two"; break;

            case 3:numberInWord =  "Three"; break;

            case 4:numberInWord =  "Four "; break;

            case 5:numberInWord =  "Five"; break;

            case 6:numberInWord =  "Six"; break;

            case 7: numberInWord =   "Seven";break;

            case 8: numberInWord =   "Eight"; break;

            case 9:numberInWord =   "Nine";break;

            case 10:numberInWord =   "Ten";break;

            default:numberInWord =   "Invalid number!";

        }
        System.out.println(number);
        System.out.println("Word number is " + numberInWord +".");
    }
}
