package day26_Unit2_Recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

    Ex: java    -> j a v a
        space     -> s p a c e
        more words -> m o r e _ w o r d s
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to add space to ?");
        String str = input.nextLine().trim();

        String spaceResult = "";

        for (int i = 0; i < str.length(); i++ ) { //(int i =0 ; i <= str.length() -1; i++){ this way also ok

            if (str.charAt(i) == ' ') {
                spaceResult += "_ ";

            } else {

                spaceResult += str.charAt(i) + " ";

            }
            }
            System.out.println("Translated " + str + " to ");
            System.out.println(spaceResult);
        }
    }
