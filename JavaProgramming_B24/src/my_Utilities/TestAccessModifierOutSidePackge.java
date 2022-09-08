package my_Utilities;

import day51_inheritance.Modifier;

public class TestAccessModifierOutSidePackge {
    public static void main(String[] args) {


        Modifier modifier = new Modifier();
        System.out.println(modifier.A);
       // System.out.println(modifier.B);cant access cause its protected and we are in different package
        //System.out.println(modifier.C); cant access because its in different package
        //System.out.println(modifier.D);
        //cannot be accessed because its
        // private
    }

}
