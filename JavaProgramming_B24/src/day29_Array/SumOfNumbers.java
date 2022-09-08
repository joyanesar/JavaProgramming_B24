package day29_Array;

public class SumOfNumbers {
    public static void main(String[] args) {

        /*
        To sum all of the value
         */

        int[] numbers = {4, 2, 5, 5, 6, 8, 9, 4, 7};

        int sum = 0;  //+=  short hand for  = sum = sum + number[0]
        sum += numbers[0];
        sum += numbers[1];
        sum += numbers[2];
        System.out.println(sum);

        // sum with loop
        int[] number1 = {4, 2, 5, 5, 6, 8, 9, 4, 7};
        int sumWithLoop = 0;

        for (int i = 0; i < number1.length; i++) { // i <= number1.length -1

            sumWithLoop += number1[i];




        }
        System.out.println(sumWithLoop);
    }
}