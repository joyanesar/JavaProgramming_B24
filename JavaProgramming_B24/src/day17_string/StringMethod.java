package day17_string;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {

        String name = "jaMes";
        System.out.println(name.equals("James"));

        System.out.println(name.equalsIgnoreCase("James"));
        System.out.println(name.equals(name.equalsIgnoreCase("James")));
        System.out.println(name.equalsIgnoreCase("JaMeS"));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        String  lastname = "bond";
        lastname= lastname.toUpperCase();
        System.out.println(lastname);
        System.out.println(name.length());
        String word = "Monday";
        word.length();
        System.out.println(word);
        System.out.println(word.length());
        String name1 = "Nesar";
        System.out.println(name.length());



    }
}
