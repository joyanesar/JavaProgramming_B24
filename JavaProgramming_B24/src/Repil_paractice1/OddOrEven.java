package Repil_paractice1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        String outPut = "";

        if(number % 2 ==0){
            //outPut = "Its an Odd number";
            System.out.println("Its an odd number");
        }else {
            //utPut = "Its an Even number";
            System.out.println("Its an even number");
        }

    }
}
