package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Unique {
    /*
    creat a method that accept arraylist and return in arraylist only
    unique values
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,1,5,1,1,3,6,10));
        System.out.println(getUniqueElements(list));
    }
                    // return type           method name     parameters
    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer> list){


        ArrayList<Integer> unique = new ArrayList<>();

        for(int each : list){
          int count = Collections.frequency(list,each);

          if(count == 1){
              // unique element
              unique.add(each);
          }
        }

        return unique;


    }



}
