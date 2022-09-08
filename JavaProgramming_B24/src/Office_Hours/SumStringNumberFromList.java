package Office_Hours;

import java.util.ArrayList;

public class SumStringNumberFromList {
    /*
    String numbers to sum
Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.
Ex:
Input:
“123”, “34”, “513” Output:
[ 6, 7, 9 ]
     */

    public static ArrayList<Integer> getSumOfString(ArrayList<String> list){

        ArrayList<Integer> numbers = new ArrayList<>();

        for(String each : list){

            int sum = 0;

            for(int i=0; i < each.length(); i++){

                sum += Integer.parseInt("" + each.charAt(i));
            }

            numbers.add(sum);
        }

        return numbers;

    // extract the inner loop make it a helper method

    }
}
