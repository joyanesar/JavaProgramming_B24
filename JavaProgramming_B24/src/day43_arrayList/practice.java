package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,1,3,67,95,95,7));
        System.out.println(getUnique(list));
    }
    public static ArrayList<Integer> getUnique(ArrayList<Integer> list){

        ArrayList<Integer> unique = new ArrayList<>();

        for(int each: list){

            int count = Collections.frequency(list,each);

            if(count == 1){
                unique.add(each);

            }
        }
        return unique;

    }
}
