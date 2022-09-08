package day19_string;

import java.util.Scanner;

public class SubStringExamples {
    public static void main(String[] args) {

        /*
        substring allows you to take part of the string base on the given index number when you give one number, that is that string of your substring and it keeps all the characters units the end.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name");
        String name= input.next();
        System.out.println("enter your l name");
        String lname = input.next();

       // String initial = input.next();

        //String s = "javascript";

//        System.out.println(s.substring(1)); // remove first characters
//        System.out.println(s.substring(2));
//        System.out.println(s.substring(4));
//        System.out.println(s.substring(7));
//
//
//        System.out.println(s.substring(0,4));
//        System.out.println(s.substring(4));
//
//        System.out.println(s.substring(2,6));
//
//        System.out.println(s.substring(0,3));
//        System.out.println(s.substring(0,2));
//        System.out.println(s.substring(0,1) + s.substring(2,4));

        //System.out.println(word.substring(0,1) + word.substring(3,4));

        String initial ;

//        name = " " + name.substring(0,1).toUpperCase() + name.substring(1,5);
//        lname= " " + lname.substring(0,1).toUpperCase() + lname.substring(1,4);


       initial = " " + name.substring(0,1).toUpperCase() + lname.substring(0,1).toUpperCase();

     //  System.out.println("You first name " + name + "  and your last name is  " + lname +initial );
       System.out.println(initial);


    }
}
