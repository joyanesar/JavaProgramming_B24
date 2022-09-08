package Repil_paractice1;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.nextLine();

        if (name.equals("Chen")) {
            System.out.println("teacher");
        } else {
            System.out.println("student");
        }

    }
}