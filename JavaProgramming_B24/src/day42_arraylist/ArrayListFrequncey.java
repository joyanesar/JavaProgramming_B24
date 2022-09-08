package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListFrequncey {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,6,7,6,9,7,5,8,2,1));
        //find how many 5 elements are in your ArrayLIST


        System.out.println(Collections.frequency(list,5));
        System.out.println(Collections.frequency(list,7));
        System.out.println(Collections.frequency(list,1));

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Nadir","mike","Nadir","james"));

        System.out.println(Collections.frequency(name,"Nadir"));



    }
}
