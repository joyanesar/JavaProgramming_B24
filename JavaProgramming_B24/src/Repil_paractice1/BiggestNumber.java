package Repil_paractice1;

import java.util.Scanner;

public class BiggestNumber {
    /*
    Write a program that checks for the biggest of 3 numbers. you get 3 int variables: n1 , n2 and n3

if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        String msg = "";


        if (num1 >=num2 && num1>num3) {
            msg = "num1 is bigger";
        } else if (num2 >=num1 && num2 > num3) {
            msg = "num2 is bigger";
        }else{
            msg = "num3 is bigger";


    }
        System.out.println(msg);
}
    }