package day38_methods;

public class SumExample {

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(2.5,3.6));
        System.out.println(word("mike"));
        System.out.println(word('k'));
    }

    // adding two parameters
    public static int sum(int a, int b) {

        return a + b;

    }

    public static double sum(double a, double b) {  // method overloading us to

        return a + b;
    }
    public static String word(String str){
        return str;
    }
    public static char word(char str ){
        return str;
    }
}