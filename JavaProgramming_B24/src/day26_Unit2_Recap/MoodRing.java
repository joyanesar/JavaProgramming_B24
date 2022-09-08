package day26_Unit2_Recap;

import java.util.Scanner;

public class MoodRing {
    public static void main(String[] args) {
        /*
        Mood Ring [Switch]
        You have a mood ring and need to know what mood you are in based on the color. The color will also provide a max budget value that is suggested for shopping

    data:

        pink:
            mood: happy
            budget: 200
        blue:
            mood: relaxed
            budget: 150
        orange:
            mood: nervous
            budget: 50
        red:
            mood: angry
            budget: 0
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is the mode ring color?");


        String mood = "";
        double budget = 0.0;
        // Manual way calling each method on the string and reassinged
//        String color = input.next();
//        color = color.toLowerCase();
//        color = color.trim();
        // Method chaining : call the methods right after another method

        String  color = input.next()
                             .trim()
                             .toLowerCase();

        switch (color){

            case "pink":
                mood ="happy";
                budget = 200.0;break;
            case "blue":
                mood = "relaxed";
                budget = 150.0;break;
            case "orange":
                mood = "nervous";
                budget = 50; break;
            case "red":
                mood = "angry";
                budget = 0.0;break;
            default:
                color = "Wrong color";


        }

        System.out.println("your color was " + color);
        System.out.println("which means your " + mood);
        System.out.println("your mode means you can spend $ " + budget);

    }
}
