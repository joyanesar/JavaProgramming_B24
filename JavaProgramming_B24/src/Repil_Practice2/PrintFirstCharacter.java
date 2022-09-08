package Repil_Practice2;

import java.util.Scanner;

public class PrintFirstCharacter {
    public static void main(String[] args) {
       // Write a program that will print out the first character of the word.

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println(word.charAt(0));

    }
}
