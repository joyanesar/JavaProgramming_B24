package day19_string;

public class EachCharacters {
    public static void main(String[] args) {
        String java = "java";

        //              01234

        System.out.println(java.charAt(0));
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));
        //System.out.println(java.charAt(4));

        char firstLetter = java.charAt(2);
        System.out.println(java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        // Above will add the ascii values of the char and print it . char + char
        System.out.println(firstLetter);
        System.out.println(" " + java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        // by adding the empty space we can do concatenation and get the character values , not addition  String + char

        String word = "java";
        System.out.println(" " + word.charAt(0) + word.charAt(3));

    }
}
