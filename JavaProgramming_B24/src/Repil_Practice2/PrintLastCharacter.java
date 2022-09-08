package Repil_Practice2;
import java.util.Scanner;
public class PrintLastCharacter {
    public static void main(String[] args) {


        //Write a program that will print out last letter of the word (string).

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.lastIndexOf(3));
    }
}
