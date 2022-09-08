package Practice1;

import java.util.Scanner;

public class CasinoEntry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The Casino");

        System.out.println("Enter you first and last  Name");
        String fistNameAndLatName = input.nextLine();

//        System.out.println("Enter Id number");
//        int   idNumber = input.nextInt();


        System.out.println("Enter your age");
        int   age = input.nextInt();

        System.out.println((age >=40 || age <=60));


    }
}
