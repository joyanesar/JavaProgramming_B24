package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        /*/
        the first Arraylist is made to be empty
        the we add 3 elements using the add method 3 times
         */

        ArrayList<String>first = new ArrayList<>();

        first.add("water");
        first.add(("item"));
        first.add("run");

        first.add("number");

        /*
        The second Arraylist object was made while copying the elements from the first Arraylist
        a collection type in the parenthesis.
         */

        ArrayList<String> second = new ArrayList<>(first);
        second.add("pend");

        System.out.println(first);
        System.out.println(second);

        // this way make a new arraylist , at this way we can add multiple arguments quiqe way to make array
        // Arrays.aslist give a list
        ArrayList<String> third = new ArrayList<>(Arrays.asList("one", "two"));
        System.out.println(third);

    }
}
