package day31_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {

        String str = "Java is fun"; //converting to arrays
        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length); // to know how many words we have

        String str1 = "Java is fun, supper fun!";
        System.out.println(Arrays.toString(str1.split(" ")));

        String cats = "bengal cat tabby cat persian cat no cat here";
        String [] arr = cats.split(" cat ");
        System.out.println(Arrays.toString(arr));


    }
}
