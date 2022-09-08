package Repil_paractice1;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String subject1,subject2,subject3,subject4,subject5,summary;
        int  num1,num2,num3,num4,num5;
        double grade1,grade2,grade3,grade4,grade5,averageGrade = 0;

        System.out.println("Welcome to the Grader");
        System.out.println("Please enter subject name number 1 and score for this subject:");

        subject1 = scan.nextLine();
        num1     = scan.nextInt();
        grade1   = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject:");
        scan.nextLine();
        subject2 = scan.nextLine();
        num2     = scan.nextInt();
        grade2   = scan.nextDouble();

        System.out.println("Please enter subject name number 1 and score for this subject:");
        scan.nextLine();
        subject3 = scan.nextLine();
        num3     = scan.nextInt();
        grade3   = scan.nextDouble();

        System.out.println("Please enter subject name number 1 and score for this subject:");
        scan.nextLine();
        subject4 = scan.nextLine();
        num4     = scan.nextInt();
        grade4   = scan.nextDouble();

        System.out.println("Please enter subject name number 1 and score for this subject:");
        scan.nextLine();
        subject5 = scan.nextLine();
        num5     = scan.nextInt();
        grade5   = scan.nextDouble();

        summary = "Summary: " + subject1 + " - " + grade1 + ", " + subject2 + " - " + grade2 + ", " + subject3 + " - " + grade3 + ", " + subject4 + " - " + grade4 + ", " + subject5 + " - " + grade5;
        averageGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5 ;
        System.out.println (summary);
        System.out.println ("Your average score is: " + averageGrade);
        System.out.println("Thank you for using Grader!\nGoodbye!");

    }
}
