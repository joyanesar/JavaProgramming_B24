package Practice4;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        /*
        Ask the user to enter a number.
         Check if that number is evenly divisible by 2, 3, and 5.
          Print the boolean values

         */

        System.out.println("Enter a number");
        int num = keyboard.nextInt();

        //boolean num1 = num / 2 ==0 ;
        System.out.println(num % 2 ==0);
        System.out.println(num % 3 ==0);
        System.out.println(num % 5 ==0);



    }
}
