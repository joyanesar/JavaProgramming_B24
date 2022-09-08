package Repil_paractice1;

import java.util.Scanner;

public class QuizQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:");
        String a = s.nextLine();

        if(a.equals("a")){
            System.out.println(a + " is wrong");
        }else if(a.equals("b")){
            System.out.println(a + " is correct");
        }else if(a.equals("c")){
            System.out.println(a + " is wrong");
        }else {
            System.out.println(a + " is not a valid answer");
        }


    }
}
