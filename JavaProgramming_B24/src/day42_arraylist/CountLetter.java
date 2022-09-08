package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CountLetter {

        // input : AAAABBCCCCCDDDDDEE;
        // outPu: A4B2C3D6ED
//
//        String name = "AAAABBCCCCCDDDDDEE";
//        String[] st1 = name.split("");
//        System.out.println(Arrays.toString(st1));
//

    public static String countEachLetter(String str){
        // How do we convert string to arraylist
        ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split(""))); // split method give string array

        String result = "";

     for(String each: list){

         if(!result.contains(each)){
             int count = Collections.frequency(list,each);

             result += each + count;
         }
     }
        return  result;
    }
    public static void main(String[] args){
        System.out.println(countEachLetter("AAAABBBCCCDDDDDEE"));

    }
}
