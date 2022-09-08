package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversSentences {
    public static void main(String[] args) {

        /*
        ask the user enter the sentences

        reverse your sentence
        ex:
        today is wednesday
         output:
         wednesday is today
         */

//
//        String str = "today is monday";
//
//        String[] day = str.split(" ");
//
//        for (String each: day){
//            System.out.println(each);
//        }


        //char[] day = str.toCharArray();

//        String [] day = str.split(" ");
//
//        String reverse = "";
//
//        for(int i=  day.length -1; i>=0; i--){
//
//            reverse += day[i] + " ";
//        }

        //System.out.println(reverse );


//        int [] nums ={4, 3, 2, 44, 1, 100, 55};
////
////        int temp = nums[0];
////        nums[0] = nums[6];
////        nums[6] = temp;
////
////        temp = nums[0+1];
////        nums[0+1] = nums[6-1];
////        nums[6-1] = temp;
////
////        temp = nums [0+2];
////        nums[0+2] = nums[6-2];
////        nums[6-2] = temp;
//        for(int i=0; i<nums.length / 2; i++){
//
//           int number = nums[i];
//            nums[i] = nums[6-i];
//            nums[6-i] = number;
//
//        }
//
//        System.out.println(Arrays.toString(nums));


//        String word = "Java is fun";
//
//
//        String[] arr = word.split(" ");
//
//        String reverse = "";
//
//        for(int i = arr.length -1 ; i>=0; i--){
//
//            reverse+=arr[i] + " ";
//        }
//
//
//        System.out.println(reverse);


        String w = "Love is life";

        String[] arr = w.split(" ");

        String reverse = "";

        for(int i = arr.length -1; i>=0; i--){


            reverse+=arr[i] + " ";



        }

        System.out.println(reverse);
    }
}