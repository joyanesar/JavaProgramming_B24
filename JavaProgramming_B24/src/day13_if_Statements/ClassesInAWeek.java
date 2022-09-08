package day13_if_Statements;

import java.util.Scanner;

public class ClassesInAWeek {
    /*
    Monday , wednesday, thursday , saturday , sunday
       -> java
    tuesday
       -> soft skills

    friday
       -> off
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = "";

        boolean isTechnicalDay = day.equals("monday") || day.equals("wednesday")
                || day.equals("thursday") || day.equals("saturday") || day.equals("sunday");

        boolean softSkills = day.equals("Tuesday");

        boolean isFriday = day.equals("Friday"); // ! is TechnicalDay && is softSkills

        if(isTechnicalDay) {

            System.out.println("java");

        }else if(softSkills) {
            System.out.println("softSkills");

        }else if(isFriday){
            System.out.println("off day");

        }else {
            System.out.println("Invalid day given");
        }

        System.out.println(day);
    }
}