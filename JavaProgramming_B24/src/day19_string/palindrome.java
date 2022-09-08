package day19_string;

public class palindrome {
    public static void main(String[] args) {

        /*
        in this approach we will revers the string manually
        then check if the string is the same the orignal


         */

        String word = "dad";
        String reverse = " " + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println(reverse);

        if(word.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
