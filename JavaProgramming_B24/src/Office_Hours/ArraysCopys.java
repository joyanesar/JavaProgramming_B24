package Office_Hours;

import java.util.Arrays;

public class ArraysCopys {
    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = a;

        int [] c = Arrays.copyOf(a, a.length); // copied

        c[0] = 300;
        System.out.println(Arrays.toString(c));

        b[0] = 100;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
