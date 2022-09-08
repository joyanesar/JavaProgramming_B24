package oopPractice.Construsctor;

import java.util.Arrays;

public class UseCarpet {
    public static void main(String[] args) {

        Carpet carpet = new Carpet(5, 4, 3, true);

        System.out.println(carpet);

        Carpet carpet1 = new Carpet(6, 9, 30, false);
        System.out.println(carpet1);

        Carpet carpet2 = new Carpet(4, 3, 0.78, true);

        System.out.println(carpet2);

        Carpet[] store = new Carpet[4];
        store[0] = carpet;
        store[1] = carpet1;
        store[2] = carpet2;
        store[3] = new Carpet(4, 8, 0.5, false);

        System.out.println(Arrays.toString(store));

    }
}
