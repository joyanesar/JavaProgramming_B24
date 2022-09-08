package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        /*
        Given a String variable with a message.
        You will check if the message contains any of these bad words: “idiot, dumb, heck”
     If the message contains any of those words print:
    " "Message not sent”. If the message is bad word free print “Message sent”

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message");

        String msg = input.nextLine().toLowerCase();

        boolean hasBadWords =msg.replace(" ","").contains("idiot") || msg.replace(" ", "").contains("dumb")||msg.replace(" ", "").contains("heck");

        if(hasBadWords){
            System.out.println("Message not sent");
        }else {
            System.out.println("Message sent");
        }


    }
}
