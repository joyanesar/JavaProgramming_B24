package Loop_practice;

public class Sum_Even_Numbers {

    public static void main(String[] args) {


        int number = 0;

        while (number++ <= 20) {

            if (number % 2 == 0) {
                System.out.print(number + " ");
            }

        }

        System.out.println();

        int number1 = 0;

        while (number1++ <= 20) {

            if (number1 % 2 == 1) {
                System.out.print(number1 + " ");
            }
        }
    }

}
