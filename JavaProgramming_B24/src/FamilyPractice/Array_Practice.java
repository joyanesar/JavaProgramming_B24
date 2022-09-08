package FamilyPractice;

import day33_multidimensional_array.MergeArrys;

import java.util.Arrays;

public class Array_Practice {
    public static void main(String[] args) {

        String[] cities = {"Albay","Troy","Watervliet","Cohes"};

        int[] num = {10,20,30,4,5,6,7,8,39};

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(num));
        System.out.println(cities.length);
        //num[0] = 50;
//        System.out.println(num[0]);
//        System.out.println(num[3] + num[4]);

        int sum = 0;
        for(int i=0;i<num.length; i++){

            sum+=num[i];

        }
        System.out.println(sum);



        int min =1;
        for(int i =0; i < num.length; i++){

            if(min > num[i]){
                min=num[i];
            }

        }
        System.out.print(min);
    }
}
