package day38_methods;

import my_Utilities.ArraysUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArrayMethod {
    public static void main(String[] args) {
        int[] a = {4 , 1 ,5};
        int[] b = {10 , 20};

        System.out.println(Arrays.toString(ArraysUtil.addElement(a, 100)));
        System.out.println(Arrays.toString(ArraysUtil.addElement(a, b)));

    }
}
