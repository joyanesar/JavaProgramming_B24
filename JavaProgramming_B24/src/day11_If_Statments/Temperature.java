package day11_If_Statments;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the temperature");
//        int  temp = key.nextInt();
//        //int  tem = 40 ;// this the hard code
//
//        if(temp > 70){
//            System.out.println("love it ");
//            System.out.println("It is nice day for party");
//
//        }else {
//
//            System.out.println("Its cold ");
//            System.out.println("stay home");
//        }

        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber  = "(" + areaCode + ")" + "-" + localNumber;
        System.out.println("Calling number " + phoneNumber);


    }
}
