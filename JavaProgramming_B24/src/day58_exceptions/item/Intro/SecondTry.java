package day58_exceptions.item.Intro;

import java.io.InvalidClassException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num = input.nextInt();
            String s = "Java";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(100));

            System.out.println("Enter another number");
            int num2 = input.nextInt();

            System.out.println(num / num2);
        }catch (InputMismatchException e) {
        }catch (ArithmeticException e) {
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Cannot divide by zero");
            System.out.println("We wanted a number");
            System.out.println("We got exception");
        }
        System.out.println("Last line");
    }
}
