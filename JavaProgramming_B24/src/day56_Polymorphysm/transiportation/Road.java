package day56_Polymorphysm.transiportation;

import day53_Inheritance.Rules.C;

public class Road {
    public static void main(String[] args) {


        Transiportation obj1 = new Transiportation();

        obj1.go();
        // Car objects
        Car obj2 = new Car();
        obj2.go();
        obj2.openTruck();

        Transiportation ob3 = new Car();
        ob3.go();
        //ob3.openTrunk(); reference for the car dose no have access to the openTrunk

        Tesla t1 = new Tesla(); // reference
        // itself

        Car t2 = new Car(); // reference supper

        Transiportation t3 = new Tesla(); // super reference
        SelfDrivable t4 = new Tesla();

        Electric  t5 = new Tesla();
    }
}