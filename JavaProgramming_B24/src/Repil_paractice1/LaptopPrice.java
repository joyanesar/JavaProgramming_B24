package Repil_paractice1;

import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Screen size");
        String screenSize =input.nextLine();
        int price = input.nextInt();
       // String screenSize ;
        //int  price;
        String msg;

        if(screenSize.equals("13.3")){
            price =+ 200;
            msg =  "Current price " + price + "for laptop 13.3";
        }else if(screenSize.equals("15.0")){
            price =+ 300;
            System.out.println("add $"+price +"to the laptop price.");
        }else if(screenSize.equals("17.3")){
            price =+ 400;
            System.out.println("add $"+price +"to the laptop price.");
        }

    }
}
