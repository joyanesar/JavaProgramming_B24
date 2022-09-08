package day30_Arrays;

import java.util.Arrays;

public class EvenAdOdd {
    public static void main(String[] args) {
        /*
        decalare an int array
        count how many even numbers
        count hou many odd numbers

        prints your counters


        challengers
        tradaitonal for loops
         for each loop
         not hard code in initials but array but use scanner to get the numbers

         */

        int[] number = {1 ,35,52 ,44,74,55};

        int even = 0;
        int odd = 0;

        String evenNumber = "";
        String oddNumbers = "";

        for(int i=0; i<number.length;i++){
            if(number[i] % 2 ==0) {
                even++;
                evenNumber +=  number[i];
            }else {
                odd++;
                oddNumbers += number[i];
                System.out.println(Arrays.toString(number));
                System.out.println("Even " + even);
                System.out.println("Even numbers " +evenNumber);
                System.out.println("Odd " + odd);
                System.out.println("Odd numbers " + oddNumbers);

                for(int eachNum:number){
                    System.out.println(eachNum);
                }

            }
        }




    }
}
