package day20_string;

public class LongestWithA {
    public static void main(String[] args) {
        /*
        [Longest with A]
Given three String variables of some text find and print the longest word that also contains 'a'
Ex: "java"
"mouse" "computer" Output: java
Ex: "java"
"mouse" "apples" Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.

             */

        String word1 = "java";
        String word2 = "computer";
        String word3 = "apples";
        String word4 =  "banana";

        String biggest = "";

        if (word1.contains("a") && word1.length() > biggest.length()) {
            biggest = word1;
        }

        if (word2.contains("a") && word2.length() > biggest.length()) {
            biggest = word2;
        }

        if (word3.contains("a") && word3.length() > biggest.length())
            biggest = word3;

        if(word4.contains("a") && word4.length() > biggest.length()){
            biggest = word4;
        }


        //System.out.println("Biggest " + biggest);

        System.out.println(biggest.isEmpty()? "None are valid": "biggest" + biggest);




    }


}
