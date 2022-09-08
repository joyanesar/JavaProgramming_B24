package day52_Inheritance;

public class Employee extends Person {

    String jobTitle;
    boolean isFullTime;


    public void work(){

        System.out.println(name + " Software Development Engineer Working at Google company");
    }


}
