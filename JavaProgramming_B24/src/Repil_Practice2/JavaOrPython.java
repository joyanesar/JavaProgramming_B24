package Repil_Practice2;

import java.util.Scanner;

public class JavaOrPython {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentences");

        String str = input.nextLine();
        int wordJava = 0;
        int wordPython = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 4).equals("java")) {
                wordJava++;
            }
        }
        for (int j = 0; j < str.length() - 5; j++) {
            if (str.substring(j, j + 6).equals("python")) {
                wordPython++;

            }
        }
        System.out.println(wordJava==wordPython);
//        if (wordJava == wordPython) {
//            System.out.println("true");
//
//        } else {
//            System.out.println("false");
        }
    }

