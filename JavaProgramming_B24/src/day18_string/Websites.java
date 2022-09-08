package day18_string;

import java.util.Scanner;

public class Websites {
    public static void main(String[] args) {
/*
Ask the user to type a website
        Check if the website is valid
            A website is valid if:
                begins with
                    www.

                and

                 at the end has:
                    .com
                    .edu
                    .gov
                    .net\
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter website");
        String website = input.nextLine();
        boolean validstarts = website.startsWith("www.");
        boolean validend = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith("gov") || website.endsWith(".net");


        if (validstarts && validend) {
            System.out.println(website + " is valid");
        } else {
            //System.out.println(website + " is invalid");
            if(!validstarts){
                System.out.println("needs to begin with www .");
            }if (!validend){
                System.out.println("needs to end with:  .com\n.edu\n.gov\nnor .net");
            }
        }
    }
}

