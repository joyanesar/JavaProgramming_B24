package officeHour;

import day53_Inheritance.Rules.C;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        // All possible reference of a TShirt object

        TShirt shirt1 = new TShirt();
        shirt1.wear();

        Clothes shirt2 = new TShirt();
        shirt2.wear();

        Object shirt3 = new TShirt();
        //shirt3.wear ; invalid because Object class does nt have wear method

        buy(shirt1);
        buy(shirt2);

        //All possible reference of jacket objects

        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();
        Clothes jacket2 = new Jacket();

        jacket2.wear();
        ((Jacket)jacket2).putOnHood();

        Jacket jacket2_5 = (Jacket) jacket2;
        jacket2_5.putOnHood();
        //jacket2.putOnHood


//        double d = 4.5;
//        int i = (int) d;
        HasHood jacket3 = new Jacket();
        ((Jacket)jacket3).wear();
        jacket3.putOnHood();


        buy(jacket1);
        buy(jacket2);
        buy((Jacket)jacket3);
        ArrayList<Clothes> list = new ArrayList<>();
        list.add(shirt1);
        list.add(shirt2);
        list.add((Clothes) shirt3);
        System.out.println(list);
       for(Clothes each: list){
           each.wear();
       }
    }
    public static void buy(Clothes buy){

    }
}
