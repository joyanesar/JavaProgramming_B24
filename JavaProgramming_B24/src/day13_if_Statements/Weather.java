package day13_if_Statements;

import com.sun.media.sound.RIFFWriter;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

            /*
            sunny , rainy , windy , snowy , foggy , cloudy
             */
       // String weather = "Sunny";
        String message = " ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weather condition");
        String weather = scan.nextLine();

        if (weather.equals("sunny")) {
            message = "Its time to go out for picnic!";

        } else if (weather.equals("rainy")) {
            message = "Stay home and  do your repilet practices";

        } else if (weather.equals("Snowy")) {
            message = "Stay home and read some books";

        } else if (weather.equals("foggy")) {
            message = "Its time to fly your kits!";

        } else if (weather.equals("cloudy")) {
            message = "You can play card with your friends";

        }
        System.out.println(message);
    }
}