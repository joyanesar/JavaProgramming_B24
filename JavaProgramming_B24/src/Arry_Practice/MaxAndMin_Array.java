package Arry_Practice;

public class MaxAndMin_Array {
    public static void main(String[] args) {
        /*
        Write a program that can find the maximum number from any given int array
         */

        int[] num = {24, 33, 15, 85, 35, 100, 101, 203};
        int[] number = {50, 20, 15, 45};
        int max = num[0];
        int min = number[0];

        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println(max);

        System.out.println();

        for (int j = 0; j < number.length; j++) {
            if (min > number[j]) {
                min = number[j];
            }

        }
        System.out.println(min);
    }
}



