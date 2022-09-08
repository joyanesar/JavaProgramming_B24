package day36_Methods;
import my_Utilities.StringUtil;

import java.util.Scanner;

public class UsingStringMethod {
    public static void main(String[] args) {

//        System.out.println(StringUtil.revers("java"));
//        System.out.println(StringUtil.revers("Nadir SoftSkill"));
//        System.out.println(StringUtil.revers(("racecar")));
//
//        String s = "racecar";
//        String reverse = StringUtil.revers(s);
//
//        System.out.println(s.equals(reverse));

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter some word to reverse");
//        System.out.println(StringUtil.revers(input.nextLine()));

        System.out.println("Enter you first name and last name");
        System.out.println(StringUtil.fixFormat(input.nextLine()+StringUtil.fixedFormat(input.next())));

//        System.out.println("Enter your last name");
//        System.out.println(StringUtil.fixFormat(input.next()));





    }
}
