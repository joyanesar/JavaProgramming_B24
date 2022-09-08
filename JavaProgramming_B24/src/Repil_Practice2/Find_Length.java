package Repil_Practice2;
import java.util.Scanner;
public class Find_Length {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");

        String text = scan.next();
        //System.out.println(text.length());
        System.out.println("Length is: " + text.length());
    }
}
