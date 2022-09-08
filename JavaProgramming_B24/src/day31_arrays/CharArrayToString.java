package day31_arrays;

import java.sql.Array;
import java.util.Arrays;

public class CharArrayToString {
    public static void main(String[] args) {


        // char array to String

        char[] arr = {'f','r','i','d','a','y'};

        String str = new String(arr); // char array  convert to string
        System.out.println(str);
        System.out.println(Arrays.toString(arr));


    }
}
