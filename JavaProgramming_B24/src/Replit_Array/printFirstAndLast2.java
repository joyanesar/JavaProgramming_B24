package Replit_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class printFirstAndLast2 {
    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple", "note"};

        System.out.println(Arrays.toString(words));
        String firstAndLast = "";



        for(int index = 0; index <words.length; index++){
            for(int eachWordIndex =0; eachWordIndex < words[index].length(); eachWordIndex++){
                firstAndLast += words[index].charAt(0) + "" + words[index].charAt(words[index].length() -1) + ";";
            }

        }
        String [] output = firstAndLast.split(";");
        System.out.println(Arrays.toString(output));

    }
}