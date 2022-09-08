package Arry_Practice;

import java.util.Arrays;

public class Array_Practice {
    public static void main(String[] args) {

        String city1 = "Albany";
        String city2 = "chicago";
        String city3 = "NewYork";
        String city4 = "Tokyo";
        String city5 = "Istanbul";

        // if we need to make 100 cities

//        String [] cities = {"Albany","chicago","NewYork","Tokyo","Istanbul"};
//
//        // How do you read individual city?
//        Arrays.toString(cities);
//        System.out.println(Arrays.toString(cities));
//        cities[1] = "kabul";
//        System.out.println(Arrays.toString(cities));
//        System.out.println(cities[0]);
//        System.out.println(cities[1]);
//        System.out.println(cities[4]);
//
//        System.out.println(cities.length);
//
//        String[] names ={"Ali","Mike","Nadir","Saim"};
//        names[0] = "joya".toUpperCase();
//        names[2] = "joya".substring(0,1).toUpperCase()+names[2].substring(1).toLowerCase();
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(names));
//
//
//
//        int[] num = {1,2,3,4,5};
//
//        for(int i=0; i < num.length; i++){
//
//            System.out.println(Arrays.toString(num));
//        }
//
//
//        String [] name = {"James","Mike","Sara","linda"};
//        System.out.println(Arrays.toString(name));
//        name[3] = "Anna";
//        System.out.println(Arrays.toString(name));
//        int [] age = {21,25,36,24,26,30};
//        System.out.println(Arrays.toString(age));
//
//        int[] numbers = {100};
//        System.out.println(Arrays.toString(numbers));
//        numbers[0] = 2000;
//        System.out.println(Arrays.toString(numbers));
//        int[] number = {1, 2,3 ,4,5 ,6, 7 ,8, 9, 10, 11, 12, 13,
//                14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,                39, 40, 41,
//                42, 43, 44, 45, 46, 47, 48, 49, 50};
//        System.out.println(Arrays.toString(number));
//
//
//        int[] newPrice = new int[4];
//
//        newPrice[0] = 24;
//        newPrice[1] = 12;
//        newPrice[2] = 20;
//        newPrice[3] = 15;
//        newPrice[0] = 35;

//        System.out.println(Arrays.toString(newPrice));

//        String[] names = new String[8];
//        String  nam = "java";
//
//        names[0] = "ali";
//        names[1] = "anna";
//        names[3] = "mike";
//        names[4] ="sam";
//        names[5] = "haroon";
//        names[6] =  "asad";
//        names[7] =  "ashly";
//
//
//
//        String str = "java is fun";
//        String[] names = str.split("");
//        String reverse = "";
//
//        for(int i = names.length - 1; ; i--){
//
//            reverse+=names[i];
//
//        }
        //System.out.println(Arrays.toString(reverse));

//        System.out.println(str.length()-1);
//        System.out.println(names[names.length-1]); // to find the last index of array
//        System.out.println(Arrays.toString(names));

////        System.out.println(names.length);
//        System.out.println(nam.length());
//
//        for (String each: names){
//            System.out.println(each);
//        }
//
//        int[] number1 = {1, 2,3 ,4,5 ,6, 7 ,8, 9, 10, 11, 12, 13,
//                14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,                39, 40, 41,
//                42, 43, 44, 45, 46, 47, 48, 49, 50};
//
//        for(int eachNumber: number1){
//            System.out.print(eachNumber + " ");

//        int[] age = {10, 20, 4, 5, 64, 50, 45, 15, 24, 5};
//
//        System.out.println(Arrays.toString(age));
//        System.out.println(age.length);
//        System.out.println(age[age.length - 2]);
//
//        double[] score = {2.5, 23.5, 8.9, 23.9, 4.7, 12.8, 9};
//        System.out.println(Arrays.toString(score));
//
//        System.out.println(score[0] + score[1]);
//
//        int[] no = {5, 9, 8, 6};
//
//        int max = 0;
//
//        if (no[0] > max) {
//            max += no[0];
//        }
//
//            if (no[1] > max) {
//                max += no[1];
//            }
//                if (no[2] > max) {
//                    max += no[2];
//                }
//                    if (no[3] > max) {
//                        max += no[3];
//                    }
//
//                    System.out.println(max);
//
//                    double[] prices = new double[5];
//
//                    prices[0] = 25.5;
//                    prices[1] = 20.5;
//                    prices[2] = 33.5;
//                    prices[3] = 35.5;
//                    prices[4] = 75.5;
//
//        System.out.println(Arrays.toString(prices));
//
//                String[] name = new String[5];
//
//                name[0] = "ali";
//                name[1] = "ana";
//                name[2] = "neg";
//                name[3] = "mis";
//                name[4] = "sam";
//                name[0] = "karim";
//
//                for(String eachName: name)
//                    System.out.println(eachName);
//
//        System.out.println(Arrays.toString(name));
//        System.out.println(name[name.length-1]);
//
//        name = new String[2];
//        System.out.println(Arrays.toString(name));
//
//        name[0] = "kam";
//        name[1] = "samir";
//        //name[2] = "jaki";
//        System.out.println(Arrays.toString(name));
//        System.out.println(name[name.length-1]);
//

        String w = "I love java";
        String [] arr = w.split(" ");

        String reverse = "";

        for(int i = arr[1].length()-1; i>=0; i--){

            reverse+=arr[1].substring(i);
        }
        System.out.println(reverse);
    }
}