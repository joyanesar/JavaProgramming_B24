package day25_For_Loops;

import java.util.Scanner;

public class CountWords {
    /*

       Give a sentence and count words
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = input.nextLine().trim();


        int numberOfSpaces = 0;

        for (int i = 0 ; i < str.length();i++){

            if(str.charAt(i) == ' '){
                numberOfSpaces++;

            }
        }

        System.out.println("Number of words: " + (numberOfSpaces +1));


        // this is with out loop:

        int originalLength = str.length();
        int newLength = str.replace(" ", "").length();
        System.out.println("Number of words: " +(originalLength - newLength +1));

    }
}
