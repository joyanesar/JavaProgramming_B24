package FamilyPractice;

import java.util.Arrays;

public class SplitEmail {
    public static void main(String[] args) {

/*
using split method to print email id and domain in separate lines
If email contains no @ character or multiple @ characters then print invalid email:
 */

        String email = "joyanisar@gmail.com";

//        if(!email.contains("@")){
//            System.out.println("Invalid email");
//        }else {
//
//            System.out.println("Its a valid email");
//
//        }
//        String[] arr = email.split("@");
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
//
//
//        if(arr.length == 2){
//            System.out.println("Email id: " + arr[0]);
//            System.out.println("Email domain: " + arr[1]);
//
//        }else {
//            System.out.println("invalid email");
//        }



        String email1  = "hoshanq@qaderi.com";

        String[] arr = email1.split("@");

        if(arr.length == 2){
            System.out.println("Email id " + arr[0]);
            System.out.println("Email domain " + arr[1]);
        }else {
            System.out.println("invalid eamil add");
        }



    }
}
