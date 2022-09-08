package FamilyPractice;

public class day01 {
    public static void main(String[] args) {
        // print from 1-100
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;

        }
        System.out.print("The sum of 1 - 10 is :" + sum);
        System.out.println();
        int product = 1;
        for (int i = 0; i <= 5; i++) {
            product *= i;

            System.out.println(product);
        }
        for(int i=50; i >= 1; i--){


            System.out.print(i + " ");
        }
    }
}