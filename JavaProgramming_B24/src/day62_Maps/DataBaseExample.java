package day62_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {
        /*
        person
        Firs name : james
        last name : bond
        age       : 35
         */
        Map<String,Object> person1 = new HashMap<>();
        person1.put("First_name","james");
        person1.put("last_name","bond");
        person1.put("Age",40);
        person1.put("diverLc",23544);
        person1.put("phone",254387);

        ArrayList<Map<String,Object>>allPeople = new ArrayList<>();
        allPeople.add(person1);

        // I want to know the first name
        System.out.println(allPeople.get(0).get("First_name"));
        System.out.println(allPeople.get(0).get("last_name"));
    }
}
