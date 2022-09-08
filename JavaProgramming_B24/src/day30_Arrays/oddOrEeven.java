package day30_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class oddOrEeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int size = input.nextInt();

        int[]num = new int[size];
        for (int i=0;i<num.length;i++){
            System.out.println("Enter a number");
            num[i] = input.nextInt();

        }

        //int [] num = {25,3,45,55,22,12,42,81};
//    cuonter vari
        int odd = 0;
        int event = 0;


        String eachEven = " ";
        String  eachOdd= "";


        for(int eachNum:num){
            if(eachNum % 2 ==0) {
                event++;
                eachEven += eachNum;
            }else {
                odd++;
                eachOdd += eachNum;
            }


        }
        System.out.println(Arrays.toString(num));
        System.out.println();


    }
}
