package day35_Methods;

public class CountingNumbers {
     /*
       Ver 1: Define a method that will count number from 0 to 5
        print the numbers in one line

        Ver 2: Define another method that will count numbers from 0 to a given number (parameter)
        */

    public static void main(String[] args) {

        countNumbersFrom0To5();
        countNumbersFrom0ToGivenNumbers(10);


    }


    public static void countNumbersFrom0To5() {


        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void countNumbersFrom0ToGivenNumbers(int n){

        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        }

    }

