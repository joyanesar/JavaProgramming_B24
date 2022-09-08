package day37_Methods;

import my_Utilities.ArraysUtil;

import java.lang.reflect.Array;

public class UsingArraysClass {
    public static void main(String[] args) {
        int [] a = {4, 15,25,3,54,42,12};

        System.out.println(ArraysUtil.minNumber(a));
        System.out.println(ArraysUtil.maxNumber(a));
        System.out.println(ArraysUtil.contains(a,5));
        System.out.println(ArraysUtil.contains(a,25));

    }
}
