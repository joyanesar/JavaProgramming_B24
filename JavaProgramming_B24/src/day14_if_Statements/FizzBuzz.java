package day14_if_Statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        Task: Evaulate your number and print based on the following:
    multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”. If the number is not disibile by any of those numbers print just the number

    Example:

        number = 5

        "FizzBuzz" -> when number is divisible by 3 and  5
        "Fizz" -> when number is divisible by 3
        "Buzz" -> when number is divisible by 5
         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number = input.nextInt();
//
//        //int number = -1;
//        String msg = "";
//
//        if(number % 3 ==0 && number % 5 ==0){
//            msg = "FizzBuzz";
//
//        }else if(number % 3 == 0 ){
//            msg = "Fizz";
//
//        }else if(number % 5 == 0){
//            msg = "Buzz";
//        }else {
//            System.out.println(number);
//        }
//
//        System.out.println(msg);
//    }
//}


        int num = 25;
        String outPUt = "";

        if(num % 5 == 0 && num % 3 ==0){

            outPUt = "FizzBuzz";
        }else if(num % 3 ==0){
            outPUt = "Fizz";

        }else if(num % 5 == 0){
            outPUt = "Buzz";
        }else {
            outPUt = "Number";
        }


        System.out.println(outPUt + " ");

    }
}