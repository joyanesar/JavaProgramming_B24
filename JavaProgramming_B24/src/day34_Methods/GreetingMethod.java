package day34_Methods;

import java.util.Scanner;

public class GreetingMethod {

    /*
    method that will hava the string parameters

    print Hello $name, how are you
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.next();
        //System.out.println("what time");
        //int time = input.nextInt();
        System.out.println("Enter your music choice");
        String music = input.next();

        greeting(name);
        //myAge(time);
        sport(music);

    }

    public static void greeting(String name ){

        System.out.println("Hello! " + name + " did you share softSkill pdf ?");

    }

    public static void myAge(int time){
        System.out.println("No ! I will share tomorrow at " + time );


    }
     public static void sport(String music){

         System.out.println("What kind of " + music + " do you like ?");

     }
     public static void personalInformation(String name,String lastN){

         System.out.println("This is My  name  is " + name + "and this is " + lastN);


     }
}
