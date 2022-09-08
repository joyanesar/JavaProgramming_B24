package day25_For_Loops;

public class CountJava {
    public static void main(String[] args) {


        String s1 = "java is a language. java can be used for a lot java";
        /*
        java = (o,4)  4 is not included   i,  i + 4
        ava  = (1,5) 5 is not included    i,  i + 4
        va i = 2,6)  6 is not included    i,   i + 4
        ...
         */

        int countJava = 0;

        for (int i = 0; i < s1.length() -3; i++) {

           // System.out.println(s1.substring(i, i + 4));

            if(s1.substring(i, i+4).equals("java")){ // to find how many times java word has been used
                countJava++;

            }


        }

        System.out.println(countJava);
    }
}