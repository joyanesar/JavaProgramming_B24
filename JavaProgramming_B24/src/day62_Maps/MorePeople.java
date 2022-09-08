package day62_Maps;

import java.util.HashMap;

public class MorePeople {
    public static void main(String[] args) {

        HashMap<Integer,Person> map = new HashMap<>();

        map.put(10,new Person("nisso"));
        Person person2 = new Person("Elmira");
        person2.age = 21;
        person2.favoriteHobby = "java";

        map.put(11,person2);
        System.out.println(map);

        map.get(10).age = 24;
        map.get(10).favoriteHobby = "selenium";
        System.out.println(map);
        System.out.println(map.get(10));

    }
}
