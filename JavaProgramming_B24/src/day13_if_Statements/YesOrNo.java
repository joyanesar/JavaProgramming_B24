package day13_if_Statements;

import java.util.Scanner;
import java.util.SplittableRandom;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = input.next();

        System.out.println("do you like soccer");
        String likeSoccer = input.next();

        if(likeSoccer.equals("yes") ||  likeSoccer.equals("Yes") || likeSoccer.equals("YES") || likeSoccer.equals("y")){

            System.out.println("who is your favorite team?");
            String team = input.next();
            System.out.println("Oh I like " + team + " too");

        }else if(likeSoccer.equals("no") || likeSoccer.equals("n")) {
            System.out.println("bye...");

        }else {
            System.out.println(firstName + " you didnt answer the question");
        }
    }
}
