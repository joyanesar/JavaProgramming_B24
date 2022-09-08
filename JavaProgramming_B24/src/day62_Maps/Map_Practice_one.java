package day62_Maps;

import java.util.HashMap;

public class Map_Practice_one {
    public static void main(String[] args) {

        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"java");
        map.put(2,"softskill");
        map.put(3,"selenium");
        map.put(4,"java");

        System.out.println(map);
        System.out.println(map.keySet());
        for(Integer key : map.keySet()){
            System.out.println("The key value is " + key);
            System.out.println("value for this key is : " + map.get(key));
            }
        }

    }

