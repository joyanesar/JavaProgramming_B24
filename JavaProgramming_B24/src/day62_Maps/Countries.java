package day62_Maps;

import Practice1.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {

        HashMap<String,ArrayList<String>>countries = new HashMap<>();
        //Key is a string - each continent
        // value is an ArrayList of string - each holds all the cities
        //in that country
        countries.put("North America",new ArrayList<>(Arrays.asList("chicago","NewYork","Dallas","Arlington")));
        countries.put("Asia", new ArrayList<>(Arrays.asList("Tashkent","paris","sivas","Kabul","tokyo")));
        countries.put("Europe", new ArrayList<>(Arrays.asList("paris","rome","berlin")));

        System.out.println(countries);

        for(String continent : countries.keySet()){
            System.out.println("Cities in " + continent + " are " + countries.get(continent));
        }
        System.out.println(countries);

        for(String continent : countries.keySet()){ //first loop goes through the keys which are continents
            System.out.println("Cities in " + continent);
            for (String city : countries.get(continent)){//second loop goes through the cities which are each Arraylist
                System.out.println(city.substring(0,1).toLowerCase());
            }
        }

    }
}
