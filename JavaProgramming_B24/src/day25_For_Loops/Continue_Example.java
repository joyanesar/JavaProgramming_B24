package day25_For_Loops;

public class Continue_Example {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) { // it prints  if you put 0 it will print odd numbers
                System.out.print(" skip ");
                continue;
            }

            System.out.print(i + " ");
        }
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) { // it prints even numbers only ,
                continue;
            }

            System.out.print(i + " ");
        }
    }
}