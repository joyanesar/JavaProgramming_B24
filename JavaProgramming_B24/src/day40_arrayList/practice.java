package day40_arrayList;

import Tasks.names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice {
    public static void main(String[] args) {

        ArrayList<String> listOneFruits = new ArrayList<>();

        listOneFruits.add("apple");
        listOneFruits.add("grape");
        listOneFruits.add("pear");
        listOneFruits.add("banana");
        listOneFruits.set(0,"peach");
        listOneFruits.set(1,"million");

        System.out.println(listOneFruits.get(0));


        System.out.println(listOneFruits.get(listOneFruits.size()-1)); // this will print last index of arraylist
        listOneFruits.add("waterMillion");
        System.out.println(listOneFruits);

        ArrayList<String>listTwoFruits = new ArrayList<>();

        listTwoFruits.add("kiwi");

        listTwoFruits.addAll(listOneFruits);  //Add all copy all list from list 1 to list two
        System.out.println(listTwoFruits);

        ArrayList <String>listThree = new ArrayList<>();

        listThree.add("tomato");
        listThree.addAll(listTwoFruits);
        System.out.println(listThree);
        System.out.println(listThree.get(listThree.size()-1));
        System.out.println(listThree.size());
        //System.out.println(listThree.removeAll(listThree)); it remove all elements
        System.out.println(listThree);
        System.out.println(listThree.contains("apple"));
        System.out.println(listThree.isEmpty());
        //listThree.clear();
        System.out.println(listThree);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,9,3,8,4,1,11,6));


        Collections.sort(list);  // sort arraylist
        list.remove(0);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);

        String [] allDrinks = {"coffee", "tea", "monster", "red bull", "coke", "pepsi", "bang", "apple juice"};

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks);

        ArrayList<String> drinks1 = new ArrayList<>(Arrays.asList(allDrinks));
        drinks1.remove(0);
        System.out.println(drinks1);


        // input : AAAABBCCCCCDDDDDEE;
        // outPu: A4B2C3D6ED

        String input = "AAAABBCCCCCDDDDDEE";

        String outPut = "";

        String[] arr = input.split(" ");

        for(String each : arr){

            if(!outPut.contains(each) ){
                int count = Collections.frequency(list,each);

                outPut += each + count;
            }

        }
        System.out.println(outPut);




    }
}
