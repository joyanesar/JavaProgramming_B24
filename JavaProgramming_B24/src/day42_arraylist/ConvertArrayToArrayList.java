package day42_arraylist;

import Practice1.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {

        Integer[] a = {1, 2, 3};

        Arrays.asList(); // this allows us to convert from Array to ArrayList

        // converting the 'a' array to Arraylist
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
        System.out.println(list);

        // Creating an array with values right away
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,1,6,7,5,2,9,41,211,23));
        System.out.println(list2);
        System.out.println(list.isEmpty());







    }
}
