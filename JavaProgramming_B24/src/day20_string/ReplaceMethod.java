package day20_string;

public class ReplaceMethod {
    public static void main(String[] args) {

        String  word = "java";

        word.replace('a','e');
        word = word.replace('a','e');
        System.out.println(word);



        String  word2 = "softskills";
        System.out.println(word2.replace('s','j'));
        System.out.println(word2.replace('k','o'));


        String msg = "Hello today is Sunday";
        System.out.println(msg.replace(" ", "")); // remove empty spaces
        System.out.println(msg);
    }
}
