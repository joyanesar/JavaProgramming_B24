package day27_nested_loops;

public class Nested_loop_Examples {
    public static void main(String[] args) {

        // print hello world 5 times
        // print hello Universe 1 time
        // print hello world 5 times
        // print hello Universe 1 time

        for (int j = 0; j < 2; j++){
            for (int i = 0; i <= 5; i++) {
                System.out.println("hello world | j: " + j + " i:" + i);
            }

            System.out.println("Hello universe\n");
        }




//
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Hello world");
//        }
//        System.out.println("Hello universe");
//
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Hello world");
        }
    }
