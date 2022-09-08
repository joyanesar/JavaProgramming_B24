package day19_string;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Locale;

public class MereChars {
    public static void main(String[] args) {


        /*
        String one : abc
        String two : def

        merge to get : abdef
         */

        String one = "abc"; // a = 0, b = 1 , c = 2
        String two = "def";

        String merged = "";
        merged +=one.charAt(0);     // merged + one.charAt(0) ; -> merged = " + a = 0;
        merged += two.charAt(0);    // merged + two .chart(0) ;  -> merged =  + d = 0;

        merged += one.charAt(1);
        merged += two.charAt(1);

        merged +=one.charAt(2);
        merged += two.charAt(2);

        System.out.println(merged);




    }
}
