package day35_Methods;

public class OurMathClass {
    public static void main(String[] args) {
        /*
        add
        subtract
        multiply
        division

         */

        add(4.5, 4.5, 1, 6);
        subtract(2.5, 3.6, 5, 3);
        multi(3.5, 3.5, 2, 6);
        division(2 , 9 );
    }
    public static void add(double numOne, double numTwo, int num, int num1) {
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
        System.out.println(num + " + " + num1 + " = " + (num + num1));
    }

    public static void subtract(double numOne, double numTwo, int num, int num1) {
        System.out.println(numOne + "  " + numTwo + " = " + (numOne - numTwo));
        System.out.println(num + " - " + num1 + " = " + (num - num1));
    }

    public static void multi(double numOne, double numTwo, int num, int num1) {
        System.out.println(numOne + " x " + numTwo + " = " + (numOne * numTwo));
        System.out.println(num + " * " + num1 + " = " + (num * num1));
    }

    public static void division(double numOne, double numTwo) {
        if(numTwo !=0){
            System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
        }else {
            System.out.println("Cannot divided by 0");
        }

    }
}
