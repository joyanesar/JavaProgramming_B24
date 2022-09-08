package day11_If_Statments;

public class IfExamples {
    public static void main(String[] args) {


        if (false) {
            System.out.println("Hello World");
        }
        if (false) {
            System.out.println("Hello World 2");

        }
         int score = 80;

        if (score > 60){
            System.out.println("you passed");
        }
        if(score <=60){
            System.out.println("you failed");

        }
        if(score >60){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }

    }
}