package my_Utilities;

public class StringUtil {
    /*
    reverse method
    it will accept the string parameter and return the reverse version of the string

     */

    public static String revers(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);


        }
        return reverse;

    }
    /*
    make a method will accept the string and return a string in proper format
    first chararcter as uppercase and the rest lowercase
     */


    public static String fixFormat(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

    }

    public static String fixedFormat(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }


    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("apple", 'p'));
        System.out.println(frequencyOfLetter("java", 'a'));
        System.out.println(frequencyOfLetter("banana", 'a'));
        System.out.println(getDuplicateCharacters("abcdabcabc"));
    }


/*

 String , letter

    how many times is the letter in the string

    example:
    apple, p
    -> 2

    return type : int

    method name: frequencyOfLetter

    parameters : String , char

 */

    public static int frequencyOfLetter(String word, char letter) {
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                counter++;
            }


        }
        return counter;

    }

    public static String getDuplicateCharacters(String str){ // java

        String allDuplicate = "";

        for(int i = 0; i < str.length(); i++){

            if(!allDuplicate.contains("" + str.charAt(i))) {

                int count = frequencyOfLetter(str, str.charAt(i));

                if (count > 1) {
                    allDuplicate += str.charAt(i);
                }
            }

        }

        return allDuplicate;

    }


}