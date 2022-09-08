package FamilyPractice;

import java.util.Scanner;

public class LoopString {
    public static void main(String[] args) {

        // word reverse
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a word");
//        String word = input.nextLine();
//
//        // String word = "java";
//        String reverse = " ";
//
////        reverse += " " + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
////        System.out.println(reverse);
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reverse += word.charAt(i);
//
//        }
//
//        System.out.println(reverse);


        // check that how many 'a' characters has
        String str = "banana";

        int counter = 0;
        for (int i = 0; i <str.length(); i++) {
            counter++;

            if (str.charAt(i) == 'a' && str.charAt(i)==('n')) {
                counter++;
            }

        }
        System.out.println(" " + counter);
    }
}