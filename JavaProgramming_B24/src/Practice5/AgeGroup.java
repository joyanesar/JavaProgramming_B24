package Practice5;

import java.util.Scanner;

public class AgeGroup {
    /*

    Write a program that can define the age groups of someone based on their given age:
infant (< 1 year)
Toddler (3 - 5)
Kid (6 - 9
Pre-Teen (10 - 12)
Teenager (13 - 17)
Young Adult (18 - 20)
Adult (21 - 35)
Middle-Aged Adult (36 - 55)
Senior Citizen (55+)

Challenge: if age > 120 or less than 0 ==> invalid entry
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        String yourAge = input.nextLine();
        //int age = 35;
        //String yourAge = "";
        if (age < 1) {
            yourAge = "Infant age";

        } else if (age >= 3 && age <= 5) {
            yourAge = "Toddler age";
        }else if(age >= 6 && age <=9){
            yourAge = "kid age";

        } else if (age >= 10 && age <= 12) {
            yourAge = " pre -Teen ages";

        }else if(age >= 13 && age <= 17){
            yourAge = "Teenager age";

        } else if (age >= 18 && age <= 20) {
            yourAge = "Young Adult age";

        } else if (age >= 21 && age <= 35) {
            yourAge = "Adult age";

        } else if (age >= 36 && age <= 55) {
            yourAge = "Middle - Age Adult ";

        } else if (age > 55) {
            yourAge = "Citizen age";

        } else if (age > 120 && age < 0) {
            yourAge = "Invalid entry";


        }
        System.out.println(yourAge);
    }
}