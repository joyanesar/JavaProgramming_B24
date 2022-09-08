package Arry_Practice;

import java.util.Arrays;

public class ShortestWord {

    public static void main(String[] args) {

        String words = "olive, fish, pursuit, old, waring, python, java, coffee, cat, ray";

        String[] arr = words.split(", ");
        String shortestWords = arr[0];


        for (String current : arr) {

            if (current.length() < shortestWords.length()) {
                shortestWords = current;

            }
        }

        int countOfShortest = 0;
        for (String current : arr) {

            if (current.length() == shortestWords.length()) {
               // System.out.println(current);
                countOfShortest++;
            }
        }


        String[] shortestArray = new String[countOfShortest];

        int y = 0;
        for (String current : arr) {
            if (current.length() == shortestWords.length()) {
              //  System.out.println(current);
                shortestArray[y] = current;
                y++;
            }
        }
                Arrays.sort(shortestArray);
                System.out.println(Arrays.toString(shortestArray));


//        for (String currentW : arr) {
//
//            if (currentW.length() < shortestW.length()) {
//                shortestW = currentW;
//            }
//        }
//        int countOfShortestW = 0;
//
//        for (String currentW : arr) {
//            if (currentW.length() == shortestW.length()) {
//                countOfShortestW++;
//            }
//        }
//
//        String[] shortestWord = new String[countOfShortestW];
//
//        int x = 0;
//        for (String currentW : arr) {
//            if (currentW.length() == shortestW.length()) {
//                shortestWord[x] = currentW;
//                x++;
//            }
//        }
//      Arrays.sort(shortestWord);
//        System.out.println(Arrays.toString(shortestWord));


    }
}