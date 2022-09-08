package day22_loops;

public class Factorial_Numbes {
    public static void main(String[] args) {

        /*
        FactorialNumber
  write a program that can return the factorial number of any given number Ex:input:
   !5 output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */

        int number = 3;
        int total = 1;

        while (number > 1){
            System.out.println(total + " * " + number + " ");

            total *= number; // total  = total * number  total = 5  20  60  2*60=120
            number--;
        }

        System.out.println(total);
    }
}
