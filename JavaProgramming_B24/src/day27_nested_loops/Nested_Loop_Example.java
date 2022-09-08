package day27_nested_loops;

public class Nested_Loop_Example {
    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {

            System.out.println("A");


            for(int j=0; j< i; j++){
                System.out.println("B");
            }
            System.out.println();
        }


    }
}