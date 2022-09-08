package day26_Unit2_Recap;

import java.util.Scanner;

public class HTMLGenerator {
    public static void main(String[] args) {
        /*
        Given a String in the following format take the number part of the generator the html tags
    Ex:
        Input:
            div^2
        Output:
            <div></div><div></div>
    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>
         */

        Scanner input = new Scanner(System.in);
        System.out.println("what html taq do you want to generate");
        String str = input.next();

        String tag = str.substring(0, str.indexOf("^"));
        //System.out.println(tag);

        int indexOfCarrot = str.indexOf("^");
        String strNum = str.substring(indexOfCarrot +1);
        //this code will turn a number in string format to a number type
        int num = Integer.parseInt(strNum);

        String html = "";
        for (int i =0; i< num; i++){
            html += "<" + tag + ">" + "</" + tag + ">";
        }

        System.out.println(html);

    }
}
