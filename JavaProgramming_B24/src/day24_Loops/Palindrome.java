package day24_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         /*
         string from user

         reverse the string

         i can use a loop to get indexes backwords
         i=

         i use those revers index with chartAt

            read chars backwords
            concat to another string

            revers string is equal to my orignal string
          */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String  word = input.nextLine();

        String reverse = " ";

        for(int index  = word.length() -1 ; index >= 0; index --){

        reverse += word.charAt(index);

        }
        System.out.println(reverse);

        if(reverse.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }


    }
}
