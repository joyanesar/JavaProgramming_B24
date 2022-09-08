package day06_arithmetic_Operators;

public class OperationsExamples {
    public static void main(String[] args) {

        System.out.println(10 -5); // int -> int
        System.out.println(10 * 5);
        System.out.println(10/5);
        System.out.println(10.0 / 5); // double ->  out put double
        System.out.println(10.0 / 3.0); // double -> double
        System.out.println((int)(10.0 / 3.0));
        System.out.println((int)10.5 / 3.0);
        System.out.println(10.5 / 3.0);
        System.out.println((int)10.5 / 3.0);

        byte b1 = 10;
        byte b2 = 5;
        int byt3 = b1 + b2; // int variable , if we want to change it to byte like this.
        byte b4 = (byte)(b1 + b2);
//  trying store byte in to int
        System.out.println( 10 % 3);
        System.out.println(b4);
        System.out.println(15 % 7);

    }
}
