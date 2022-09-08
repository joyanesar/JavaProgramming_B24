package day16_Switch;

import day02_print_statements.ShoppingReceipt;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        boolean isGreen = true;
        String action = isGreen ? "go" : "Photo Enforce";
        System.out.println(action);

        String name = "Nadir";
        String className = name.equals("Nadir")? "Soft skills" : "Java";
        System.out.println(className);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println(number % 2 == 0 ? "Even number" : "Odd number");

//        System.out.println("Enter month number");
//        int num = input.nextInt();
//        String monthName = "April, May ,June";
//        System.out.println(monthName.equals("2")? "April": "May))";
        System.out.println("Enter number One");
        double numberOne = input.nextDouble();
        System.out.println("Enter number two");
        double numberTwo = input.nextDouble();

        double max = numberOne > numberTwo ? numberOne : numberTwo;
        System.out.println(max);


    }
}
