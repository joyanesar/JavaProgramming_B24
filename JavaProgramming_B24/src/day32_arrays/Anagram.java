package day32_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

     /*
     an anagram is a word or phrase formed by rearranging the letters of a different word or phrase

     ex;
     abc
     cba
      */


        String one = "listen";
        String two = "silent";

        char[] st = one.toCharArray(); // converted string to Arrays
        char[] st1 = two.toCharArray();

        // sort the characters in order

        Arrays.sort(st);
        Arrays.sort(st1);

        System.out.println("Is anagram: " + Arrays.equals(st,st1));

    }
}
