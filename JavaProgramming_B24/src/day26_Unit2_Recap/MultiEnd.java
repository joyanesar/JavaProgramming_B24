package day26_Unit2_Recap;

import java.util.Scanner;

public class MultiEnd {
    public static void main(String[] args) {
        /*
        Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

    Ex:
        Input:
            Hello?
            3
        Output:
            Hello????

    Ex:
        Input:
            java
            5
        Output:
            javaaaaaa
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = input.nextLine();

        System.out.println("Enter how many times you want to repeat the end");
        int repeat = input.nextInt();

        for(int i =0; i<repeat; i++ ){
            text += text.charAt(text.length()-1); // its always the last index
            //System.out.println(text);
        }
        System.out.println(text);

    }
}













