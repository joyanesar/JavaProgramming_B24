package Practice4;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {


    /*
    Write the program that will calculate the average grade.
    Use 5 String variables and 6 double variables to hold the subject and the grade value.
     Build a summary with all the information by concatenating the subjects and grades.
     Then calculate the average grade and print display the average score too.
     */
        Scanner scan = new Scanner(System.in);
        String subject1,subject2,subject3,subject4,subject5;
        double score1,score2,score3,score4,score5,averageScore = 0;
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        subject1 = scan.nextLine();
        score1 = scan.nextInt();
        score1 = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        scan.nextLine();
        subject2 = scan.nextLine();
        score2   = scan.nextInt();
        score2   = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        scan.nextLine();
        subject3 = scan.nextLine();
        score3   = scan.nextInt();
        score3   = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        scan.nextLine();
        subject4 = scan.nextLine();
        score4   = scan.nextInt();
        score4   = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        scan.nextLine();
        subject5 = scan.nextLine();
        score5    = scan.nextInt();
        score5    = scan.nextDouble();

        System.out.println("Summary: " + subject1 +"_"+score1 + ","+ subject2+ "_" + score2+ ","+subject3 + "_"+score3+","+subject4+"-"+score4+","+subject5+"_"+score5);
        averageScore = ( score1 + score2 + score3 +score4 + score5) / 5;
        System.out.println("Your average is: " + averageScore + "\"nThank you for using Grade!\nGoodbye!");


    }
}