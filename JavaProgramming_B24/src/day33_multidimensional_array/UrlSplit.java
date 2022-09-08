package day33_multidimensional_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UrlSplit {
    public static void main(String[] args) {

        String url = "http://learn.cybertekschool.com/courses/130";

        url.split("/"); // string method gives string array
        url.split(":");



        String [] parts = url.split("/");
        System.out.println(Arrays.toString(parts));
        Arrays.sort(parts);
        System.out.println(Arrays.toString(parts));


    }
}
