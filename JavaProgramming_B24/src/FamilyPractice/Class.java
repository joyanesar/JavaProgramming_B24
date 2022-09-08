package FamilyPractice;

public class Class {
    public static void main(String[] args) {


        JavaClass batch24 = new JavaClass();

        batch24.instructor = "Saim";
        batch24.subject    = "java";
        batch24.startedDate = 07/25/2021;
        batch24.endDate     =    03/20/2022;
        batch24.major        = "SDET";
        batch24.isItFreeCourse = true;


        System.out.println("Our instructor name is " + batch24.instructor);
        System.out.println("We are learning " + batch24.subject);
        System.out.println("We started at " + batch24.startedDate);
        System.out.println("We will end it at " + batch24.endDate);
        System.out.println("Our major will be " + batch24.major);
        System.out.println("Is it free Course ? " + batch24.isItFreeCourse);

        batch24.learn();
        batch24.day();


        JavaClass batch25 = new JavaClass();
        batch25.subject = "sofskill";



    }
}
