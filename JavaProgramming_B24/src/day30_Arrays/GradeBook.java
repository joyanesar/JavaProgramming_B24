package day30_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        /*
        Student array -> name of students
        grade values (double) -> grade of students


        [james bond]
        [80]

         */
        Scanner input = new Scanner(System.in);

        String [] studentNames = {"Mike","Sam","Anna","Jame"};
        double[]  grade = {75.9, 85.5, 88.90, 99.9};

        for(int i=0; i<studentNames.length; i++){
            System.out.println("Enter students name");
            studentNames[i] = input.next();


            System.out.println(studentNames[i] + " -> " + grade[i]);
        }
    }
}
