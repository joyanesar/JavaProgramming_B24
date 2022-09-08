package day29_Array;

import java.util.Scanner;

public class PickMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        String [] months = {"Jan","Feb","Mar","Apr","June","July","August","Sep","Oct","Nov","Dec"};
        String [] months1 = {" ","Jan","Feb","Mar","Apr","June","July","August","Sep","Oct","Nov","Dec"};
        System.out.println("Enter a month");
        int number = input.nextInt();

        System.out.println("The month you picked is: " + months[number-1]);
        System.out.println("The month you picked is: " + months1[number]);




    }
}
