package day62_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateInCollections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("James","Nisso","Anna","Beth"));
        System.out.println(list);
        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

        while (it.hasNext()){
           // System.out.println(it.next());
            String name = it.next();
            if(name.startsWith("A")){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
