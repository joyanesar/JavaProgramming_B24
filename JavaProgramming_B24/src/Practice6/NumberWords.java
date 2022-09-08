package Practice6;

import java.util.Scanner;

public class NumberWords {
    /*
    Write a program that will display the given number in its word form. Create for numbers 1-10. Any other number is invalid data
    Ex:
        input: 1
        output: one

        input: 5
        output: five
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        String numberInWord = " ";
        boolean validNumber = true;

        switch (number) {
            case 1:
                numberInWord = "One";
                break;
            case 2:
                numberInWord = "Two";
                break;
            case 3:
                numberInWord = "Three";
                break;
            case 4:
                numberInWord = "Four";
                break;
            case 5:
                numberInWord = "Five";
                break;
            case 6:
                numberInWord = "Six";
                break;
            case 7:
                numberInWord = "Seven";
                break;
            case 8:
                numberInWord = "Eight";
                break;
            case 9:
                numberInWord = "Nine";
                break;
            case 10:
                numberInWord = "Ten";
                break;
            default:
                System.out.println("Invalid number");
                validNumber = false;


        }
        if (validNumber) {
            System.out.println("Your word number is: " + numberInWord);
        }
    }
//
//        if (number.equals("1")) {
//
//            System.out.println("One");
//
//        }else if(number.equals("2")) {
//            System.out.println("Two");
//
//        }else if(number.equals("3")) {
//            System.out.println("Three");
//
//        }else if(number.equals("4")) {
//            System.out.println("Four");
//
//        }else if(number.equals("5")) {
//            System.out.println("Five");
//
//        }else if(number.equals("6")) {
//            System.out.println("Six");
//
//        }else if(number.equals("7")){
//            System.out.println("Seven");
//
//        }else if(number.equals("8")) {
//            System.out.println("Eight");
//
//        }else if(number.equals("9")) {
//            System.out.println("Nine");
//
//        }else if(number.equals("10")) {
//            System.out.println("Ten");
//        }else{
//            System.out.println("Invalid number");
//
//
//
//        }
//    }
}