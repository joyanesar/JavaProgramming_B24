package day62_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(2, "two");
        map1.put(4, "four");
        map1.put(1, "one");
        map1.put(6,"six");
        map1.put(5, "five");
        map1.put(3, "three");
        System.out.println(map1);
        System.out.println(map1.keySet());
        Map<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(2, "two");
        map2.put(4, "four");
        map2.put(1, "one");
        map2.put(6,"six");
        map2.put(5, "five");
        map2.put(3, "three");
        System.out.println(map2);
        System.out.println(map2.keySet());

        Map<Integer,String> map3 = new TreeMap<>();
        map3.put(2, "two");
        map3.put(4, "four");
        map3.put(1, "one");
        map3.put(6,"six");
        map3.put(5, "five");
        map3.put(3, "three");
        System.out.println(map3);
        System.out.println(map3.keySet());
        System.out.println("TreeMap3 " + map3);

        Map<String,String> map4 = new HashMap<>();
        map4.put("apple","juice");
        map4.put("water","pool");
        map4.put("computer","chip");
        map4.put("zebra","zoo");
        map4.put("Class","java");

        Map<String,String> map5 = new TreeMap<>();
        map5.put("apple","juice");
        map5.put("water","pool");
        map5.put("computer","chip");
        map5.put("zebra","zoo");
        map5.put("Class","java");
        map5.put("null","empty");

        System.out.println("String keyed HashMap4 " + map4);
        System.out.println("String keyed TreeMap5 " + map5);

        Map<String,String> map6 = new LinkedHashMap<>();
        map6.put("apple","juice");
        map6.put("water","pool");
        map6.put("computer","chip");
        map6.put("zebra","zoo");
        map6.put("Class","java");

        System.out.println("String keyed HashMap4 " + map4);
        System.out.println("String keyed TreeMap5 " + map5);
        System.out.println("String keyed LinkedHashMap6 " + map6);
    }
}
