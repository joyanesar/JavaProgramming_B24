package day12_IfStatements;

import java.util.Scanner;

public class If {
    /*
    Write Java program that will have three numbers and print the greatest number.

    First number: 4
    Second number: 8
    Third number: 1

    Output:
    The greatest number from 4, 8, 1 is:  8
     */
    public static void main(String[] args) {

        int first = 20;
        int second = 55;
        int third = 10;

        int biggest =0;

        Scanner input = new Scanner(System.in);

        if (first > second && first > third) {
            biggest = first;
        }
        if (second > first && second > third) {
            biggest = second;
            //System.out.println(biggest);
        }
        if (third > first && third > second) {
            biggest = third;

        }
        System.out.println("Our biggest number is : " + biggest);
    }
}