package Relit_Array_practice;

import day33_multidimensional_array.MergeArrys;

import java.util.Arrays;

public class largest_Word {
    public static void main(String[] args) {

        /*
        Given the array words find and print the word with the largest length.
         Assume that there are no 2 words with longest length


         words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
          Outputs: jaaaaavvaaaaaaaaaa
         */

        String[] words = {"aaa", "cat", "red","bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        String longestArr = words[0];

        for(int i=0; i < words.length; i++){

            String currentWords = words[i];

            if(currentWords.length() > longestArr.length()){
                longestArr = currentWords;
            }

        }

        System.out.println("Longest word is: " + longestArr);

//
//        String word = "aaa,  bbbbb,   whasstupppp, longg , jaaaaavvaaaaaaaaaa";
//
//        String longestW = " ";
//
////        for(int i=0; i <words.length; i++){
////            String crrWord = "";
////
//
//            if(crrWord.length() > longestW.length()){
//
//                longestArr = crrWord;
//            }
//        }
//
//        System.out.println("The longest word is :" + longestArr);

//        String w = "adobe";
//        String outPut = "";
//
//        for(int i=0; i<w.length(); i++){
//
//          //  outPut = w.substring(0,1) + w.substring(w.length()-1);
//            outPut = w.charAt(0) + "" + w.charAt(w.length()-1);
//
//            }
//
//        System.out.println(outPut);
//
//        String str = "Java is fun";
//
//        String [] arr = str.split(" ");
//
//        String rev = "";
//
//        for(int i = arr.length - 1; i>=0; i++){
//            rev+=arr[i] + " ";
//
//        }
//        System.out.println(rev);
        /*
        input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

         output: [cat, old, ray]
         */

//       String word = " olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
//
//       String[] arr = word.split(",");
//
//       String shortest = arr[0];
//        for(String current:words){
//
//           String currentW = "";
//
//           if(current.length() > shortest.length()){
//               shortest = current;
//           }
//       }
//
//        System.out.println(shortest);

    }
}
