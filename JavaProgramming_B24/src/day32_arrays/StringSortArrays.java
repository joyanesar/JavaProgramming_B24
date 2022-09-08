package day32_arrays;

import java.util.Arrays;

public class StringSortArrays {
    public static void main(String[] args) {


        String [] strs = {"4java", "8eight", "Hello", "hello", "HEllo", "$Dollar" ,"word5","$apple",""};


        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));  // special char is always comes first


        String [] st = {"java","not","fun"};

        System.out.println(Arrays.equals(strs,st));
;







    }
}
