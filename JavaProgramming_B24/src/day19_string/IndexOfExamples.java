package day19_string;

public class IndexOfExamples {
    public static void main(String[] args) {

        // charAt -> takes a number (index) and gives back a char
        // indexOf  Takes  a char/String and gives back the position / index/number


       // String s = "apple";
        //System.out.println(s.indexOf('j'));
        //System.out.println(s.indexOf("p"));
       // System.out.println(s.indexOf(s.indexOf("e"));
//        System.out.println(s.indexOf('a'));
//        System.out.println(s.indexOf('z'));
//        System.out.println(s.indexOf('v'));
//        System.out.println(s.indexOf("ja"));
//        System.out.println(s.indexOf("va"));
//        System.out.println(s.indexOf("Va"));
//        System.out.println(s.indexOf("va"));
       // System.out.println(s.indexOf('p',1));


        String  m = "thanks";

        m.substring(3);
        //m.substring(1);
       //m.substring(6);

        System.out.println(m);
        m.substring(0,3); //tha      first number always include but the second number not included
        m.substring(0,5); // hank
        m.substring(0,2);  // th
        m.substring(1,5);  // hank
        m.substring(2,6); // anks
        m.substring(2,7); // error






    }
}
