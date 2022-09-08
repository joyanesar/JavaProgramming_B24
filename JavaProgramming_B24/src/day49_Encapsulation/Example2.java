package day49_Encapsulation;

import java.util.Arrays;

import static java.util.Arrays.*;  // * all static ones
import static java.lang.Math.*;  //allow use PI

public class Example2 {

        public static void main(String[] args) {
            int[] a = {1, 2, 3, 8, 6, 9, 7};

            sort(a);
            System.out.println(Arrays.toString(a));
            System.out.println(PI);
            System.out.println(cos(4.9));
        }
    }