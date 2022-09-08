package day13_if_Statements;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        //String city = "NewYork";
        String message = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your city");
        String city = input.nextLine();

        if (city.equals("albany")) {
            //System.out.println("City is virginia");
            message = "This is city of New York";
        } else {
            // System.out.println("City is not virginia");
            message = "This is not city of New York";

            if (city.equals("california")) {
                //System.out.println("City is California");
                message = "This is california state";

            } else {
                //System.out.println("City is not California");
                message = "Invalid city try again later!";



            }
        }
        System.out.println(message);
    }
}
//        String  str = "java";
//        String  str2 = " java";
//
//        if(!str.equals(str2)) {  // str == str2
//            System.out.println("Strings are not equal");
//        }else {
//            System.out.println("The Strings are equal");
//        }
//                }    }
//}
