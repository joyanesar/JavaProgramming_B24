package day17_string;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.String;
public class CreateStrings {
    public static void main(String []args){

        String first = "java"; // String literal
        // create a String object in the String pool

        String second = new String("java");  // String using new
        // creates a String objects in the heap , Not in the String pool


        System.out.println(first == second); // == with String does not check the value
        // It checks the memory location and compares them

        System.out.println(first.equals(second)); // .equals compares the values , not the memory location ;

        String third = "java";

        System.out.println(first == third);

        String fourth = third;
        String five  = second;






    }
}
