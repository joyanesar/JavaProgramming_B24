package Repil_paractice1;

import java.util.Scanner;

public class AgeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age");
        int age = input.nextInt();

        String msg = "";

        if(age < 2) {
            msg = "ineligible";

        }else if( age > 1 & age <=2){
            msg = "toddler ";

        }else if(age >= 3 && age <=5) {
            msg = "early childhood";
        }else if(age >=6 && age <=7) {
            msg = "young reader";
        }else if(age >=8 && age <=10) {
            msg = "elementary";
        }else if(age >=11 && age <=12) {
            msg = "middle";
        }else if(age == 13) {
            msg = "impossible";
        }else if(age >= 14 && age <=16) {
            msg = "impossible";
        }else if(age==18) {
            msg = "scholar";
        }else if(age >18) {
            msg = "ineligible";
        }else {
            msg = "Wrong entry";


        }
        System.out.println(msg);

    }
}
