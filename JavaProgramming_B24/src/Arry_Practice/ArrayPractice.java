package Arry_Practice;

public class ArrayPractice {

    public static void main(String[] args) {
        String st = "abcdabcdabc";
        String uniqueChars = "";

        for(int i =0; i < st.length(); i++) {


            if (!uniqueChars.contains(" " + st.charAt(i))) {
                uniqueChars += st.charAt(i);
            }
        }
        System.out.println(uniqueChars);


    }


}
