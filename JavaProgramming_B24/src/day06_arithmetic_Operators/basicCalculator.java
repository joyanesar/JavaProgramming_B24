package day06_arithmetic_Operators;

public class basicCalculator {
    public static void main(String[] args) {
        double  num1 = 10;
        double  num2 = 4;

        double addResult = num1 + num2;
        double subResult = num1 - num2;

        double multiResult = num1 * num2;
        double diResult    = num1 / num2;
        double reResult   = num1 % num2;


        System.out.println( num1 + "+" +num2 + " = " + addResult); // 10 + 4 = 14
        System.out.println( num1 + "-" +num2 + " = " + subResult);
        System.out.println( num1 + "*" +num2 + " = " + multiResult);
        System.out.println( num1 + "/" +num2 + " = " + diResult);
        System.out.println( num1 + "%" +num2 + " = " + reResult);

//        approach 2
        System.out.println( num1 + " + " +num2 + " = " + (num1 + num2));
        System.out.println( num1 + "-" +num2 + " = " + (num1 - num2));
        System.out.println( num1 + " * " +num2 + " = " + (num1 * num2));
        System.out.println( num1 + " / " +num2 + " = " + (num1 / num2));
        System.out.println( num1 + " % " +num2 + " = " + (num1 % num2));


        System.out.println(1 + 2 +"java"); // before string it will calculate any number used
        // out put is 3java
        System.out.println(1 + "java" + 2);


//   Concatenation

        System.out.println("java " + (5 + 4)); // with out parenthsis out put will come java54 // with parenthsis java9
//      out put is java9


        char a = 'A';
        char b = 'B';
        System.out.println(a + b +"");  //it does addition
        System.out.println(""+a + b);  /// it gives the value in the parenthesis
        System.out.println(""+ "" +a + b );
    }
}


