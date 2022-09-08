package Office_Hours;

import java.util.ArrayList;
import java.util.Arrays;

public class FourLess {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal","shortcut","output"));
        System.out.println(getWordLessThanFour(list));
        System.out.println(getWordLessThanFour2(list));

    }
        /*
        Four or less
Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut” Output:
[ tree, loop, cat ]
/*
         */       // return type        method              parameter
    public static ArrayList<String> getWordLessThanFour(ArrayList<String> list){

        ArrayList<String> validWords = new ArrayList<>();

         for(String each: list){
             if(each.length() <= 4){
                 validWords.add(each);
             }
         }
        return validWords;
    }
    public static ArrayList<String> getWordLessThanFour2(ArrayList<String> list){

        list.removeIf (str -> str.length() > 4 );
        return list;

        }
}