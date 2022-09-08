package Repil_Practice2;

import java.util.Scanner;

public class Find_User {
    public static void main(String[] args) {

//        String user1 = "MaxPayne";
//        String user2 = "AlanWake";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName = input.nextLine();

        String msg = "";

        if(fullName.equals("MaxPayne") || fullName.equals("AlanWake")){
            msg = "user found!";
        }else {
            msg = "user not found!";
        }
        System.out.println(msg);
    }
}
