package day33_multidimensional_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {

        int [] a = { 1, 2, 3};
        int [] b = a;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
        a[0] = 100;
        b[1] = 200;

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));

        System.out.println();

        int [] c = {20, 30, 40};
        int [] d = Arrays.copyOf(c,c.length +1);
        //int [] d = Arrays.copyOf(c,3);

        c[0] = 200;
        c[2] = 300;
        //c[3] = 1000;

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));





    }
}
