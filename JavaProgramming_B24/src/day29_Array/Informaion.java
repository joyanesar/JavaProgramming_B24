package day29_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Informaion {
    public static void main(String[] args) {
        /*

        Student array


        id -> 0
        first name -> 1
        last name -> 2
        batch number -> 3
         */

        String [] student = {"firstName","lastName"};
        int [] id = {0,1,2,3};

        System.out.println(Arrays.toString(student));
        System.out.println(Arrays.toString(id));

        String [] studentOne = {"001","Jame","Bond","7"};


        String [] studentTwo = new String[4];

        studentTwo[0] = "002";
        studentTwo[1] = "Mr";
        studentTwo[2] = "Smith";
        studentTwo[3] =  "24";


        System.out.println(Arrays.toString(studentOne));
        System.out.println(Arrays.toString(studentTwo));

        Scanner input = new Scanner(System.in);

        String [] studentThree = new String[4];
        System.out.println("Enter your Id");
        studentThree[0] =input.next();
        System.out.println("Enter your  first name");
        studentThree[1] = input.next();
        System.out.println("Enter your last name");
        studentThree[2] = input.next();
        System.out.println("Enter your bacth number");
        studentThree[3] =input.next();




        System.out.println(Arrays.toString(studentThree));

    }
}
