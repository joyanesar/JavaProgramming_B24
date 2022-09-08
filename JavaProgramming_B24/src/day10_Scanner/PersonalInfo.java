package day10_Scanner;

import java.util.Scanner;

public class PersonalInfo {
    /*
    create a class PersonalInfocreate a main methodcreate a Scanner objectAsk the user to enter their age (byte),
     */
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Enter your age");

        byte age = key.nextByte();

        System.out.println("Enter your favorite number");

        long favoriteNum = key.nextLong();

        System.out.println("Are you a Student : True or False ");
        boolean isStudent =key.nextBoolean();

        System.out.println("This is your personal info:");
        System.out.println("age " + age);
        System.out.println("favorite number " + favoriteNum);
        System.out.println("are you student " + isStudent);

    }
}
