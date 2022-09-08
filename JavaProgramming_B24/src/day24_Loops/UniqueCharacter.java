package day24_Loops;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        /*
        ask for word
        ask for a letter

        is the letter unique in the word

            java
            j
            -> unique

            java
            a
            -> not unique
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine().toLowerCase();


        System.out.println("Enter a letter");
        char letter = input.next().charAt(0);

//        String word = "java";
//        char letter = 'a';
       int count = 0;


        for (int i = 0; i < word.length(); i++) { // i <= word.length() -1


            if(word.charAt(i) == letter){
                System.out.println();
                count++;

                System.out.println(count);

            }

        }
        if(count != 1){
            System.out.println(letter + " not unique");


        }else {
            System.out.println(letter + " is unique");
        }



    }
}
