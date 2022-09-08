package day29_Array;
import java.util.Arrays;
public class Array_Intro_Example {
    public static void main(String[] args) {

        String city1 = "San Fransisco";
        String city2 = "Moscow";
        String city3 = "Madison";
        String city4 = "Tokyo";
        String city5 = "Baghdad";

        String [] cities = {"SanFransisco","Moscow", "Madison","Tokyo","Baghdad"}; // there are five elements in this arrays
          //                        0          1          2       3        4
//        System.out.println(cities[0]);
//        System.out.println(cities[1]);
//        System.out.println(cities[2]);
//        System.out.println(cities[3]);
//        System.out.println(cities[4]);
        //How do we know the number of cities / number of elements

        // to read all cities use this method
        System.out.println(cities.length);
        System.out.println(Arrays.toString(cities));
        // length -1 ; gives you the last index of string
        System.out.println(cities.length -1);

        System.out.println(cities[cities.length-1]);

        int number [] = {0,1,3,4,5,6,7,8,9,10}; //
        System.out.println(Arrays.toString(number));


        }

    }
