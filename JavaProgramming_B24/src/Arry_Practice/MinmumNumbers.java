package Arry_Practice;

public class MinmumNumbers {
    public static void main(String[] args) {

        /*
        Write a program that can find the minimum number from any given int array
         */

        int[] numbers = {122,23,38,19,42,10};

        int min = numbers[0];

        for(int i=0; i<numbers.length; i++){

            if(numbers[i] < min){

                min = numbers[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }
}
