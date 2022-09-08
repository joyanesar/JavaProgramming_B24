package day15_statements;

import java.util.Scanner;

public class SwitchExample_Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which floor you  go?");
        int floorNum = input.nextInt();

        switch (floorNum){
            case  1:
                System.out.println("Going to floor 1");
                System.out.println("Companies on this floor are: lobby , verizon , Starbucks");
                break;
            case 2:
                System.out.println("Going to floor 2");
                System.out.println("Companies on this floor are: Atnt , AirLines , google");
                break;
            case 3:
                System.out.println("Going to floor 3");
                System.out.println("Companies on this floor are: CVS , Gaming , Rental");
                break;
            case 4:
                System.out.println("Going to floor 4");
                System.out.println("Companies on this floor are: Apple , Uber , Lyft, Costco");
            default:
                System.out.println("wrong entry!");



            }
//            if(floorNum == 1){
//                System.out.println("Going to floor 1");
//                System.out.println("Companies on this floor are: lobby , verizon , Starbucks");
//            }else if(floorNum == 2){
//                System.out.println("Going to floor 2");
//                System.out.println("Companies on this floor are: walmart , priceChoper , Walgreen");
//            }else if(floorNum == 3){
//                System.out.println("Going to floor 3");
//                System.out.println("Companies on this floor are: lobby , verizon , Starbucks");
//            }else if(floorNum == 4){
//                System.out.println("Going to floor 4");
//                System.out.println("Companies on this floor are: lobby , verizon , Starbucks");
            }
        }

//    }


