package day30_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /*
        String array
        0 - First name
        1- account number
        2- balance
        3- account type
         */
        Scanner input = new Scanner(System.in);
        String[] bankAccountOne = {"firstName", "lastName", "accountNumber", "balance", "accountType"};
        String[] bankAccountTwo = new String[5];
        bankAccountTwo[0] = "mike";
        bankAccountTwo[1] = "jame";
        bankAccountTwo[2] = "1234";
        bankAccountTwo[3] = "2000";
        bankAccountTwo[4] = "saving";

        String[] bankAccountThree = new String[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name");
        bankAccountThree[0] = input.next();
        System.out.println("Enter your account number");
        bankAccountThree[1] = input.next();
        System.out.println("Enter your balance");
        bankAccountThree[2] = input.next();
        System.out.println("Enter your account type");
        bankAccountThree[3] = input.next();
        System.out.println("Enter your balance");
        bankAccountThree[4] = input.next();


        // Dynamic scanner input with arrays

        String[] bankAccountFour = new String[4];
        String[] questions = {"firstName", "accountNumber", "balance", "accountType"};

        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your " + questions[i]);
            bankAccountFour[i] = input.next();


            String [] bankAccountFive = new String[5];
            String [] ask = {"name","address","major","phoneNumber","salary"};

            for(int j=0;j<bankAccountFive.length; j++){
                System.out.println("Enter your " + ask[j]);
                bankAccountFive[i] = input.next();
                bankAccountFive[i] = input.next();
                bankAccountFive[i] = input.next();
                bankAccountFive[i] = input.next();
                bankAccountFive[i] = input.next();
                bankAccountFive[i] = input.next();

            }


//        System.out.println("First account :" + Arrays.toString(bankAccountTwo) );
//        System.out.println("Second: " + Arrays.toString(bankAccountTwo));
//
//        System.out.println(Arrays.toString(account));
//
//        System.out.println("What your firstName?");
//        account[0]=input.next().toUpperCase();
//        System.out.println("What is your lastName");
//        account [1] = input.next().toUpperCase();
//        System.out.println("What is your account number?");
//        account [2] =input.next();
//        System.out.println("Enter your balance ");
//        account [3] =input.next();
//        System.out.println("what is your account type");
//        account [4] =input.next().toUpperCase();
//
//
//        System.out.println(Arrays.toString(account));

            System.out.println("first name " + Arrays.toString(bankAccountOne));
            System.out.println("second account " + Arrays.toString(bankAccountTwo));
            System.out.println("Third account : " + Arrays.toString(bankAccountThree));
            System.out.println("Fourth account " + Arrays.toString(bankAccountFour));
            System.out.println("Five account " + Arrays.toString(bankAccountFive));


        }
    }
}