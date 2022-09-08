package day60_collections;

import day57_polymorphism.driver.Link;

import java.util.*;

public class ListVersa {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(2));


        List<String> linked = new LinkedList<>();
        linked.add("a"); // a is the node // linked is the reference
        linked.add("b");
        linked.add("c");
        linked.add("c");
        linked.add("null");
        System.out.println(linked);
        System.out.println(linked.get(2));
        ((LinkedList) linked).addFirst("Hello");
        System.out.println(linked);

        List<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("c");
        vector.add(null);
        System.out.println(vector);


        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add(null);
        System.out.println(set);


//        for(String each: set){
//            System.out.println(each);
//        }

        HashSet<String> set2 = new HashSet<>(list); // it converts to list
        System.out.println(set2);
    }
}
























