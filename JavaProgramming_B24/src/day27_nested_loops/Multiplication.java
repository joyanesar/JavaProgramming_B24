package day27_nested_loops;

public class Multiplication {
    public static void main(String[] args) {

        for (int i=1; i<=10; i++){

//            System.out.println("___ Table for " + i + "___");

            for (int j=1; j <= 10; j++ ){


                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();

        }

    }
}
