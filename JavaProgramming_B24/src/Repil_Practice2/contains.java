package Repil_Practice2;

import java.util.Scanner;

public class contains {
    /*
    Write a program that will verify if the sentence contains word. Print out the result as a boolean value.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence");

        String word = input.nextLine();
        String sentence = input.nextLine();

//        if (sentence.contains(word)) {
//            System.out.println("You got it");
//        } else {
//            System.out.println("Try write new sentences");
//        }
       System.out.println(sentence.contains(word));
        }
    }
