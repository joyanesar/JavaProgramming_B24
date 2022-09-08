package day22_loops;

import java.util.Scanner;

public class HelloProgramer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        ask message

        hell -> hi

        bye- > okay bye and stops the conversation
         */

        boolean continueTalking = true;

        while (continueTalking){

            System.out.println("Enter your message");
            String msg = input.nextLine();

            if(msg.equals("hello")){
                System.out.println("Hi");

            }else if(msg.equals("bye")){
                System.out.println("okay bye");
                continueTalking = false;
            }
        }

    }
}
