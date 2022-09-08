package day37_Methods;

public class NumberReturnMethods {
    /*
    Create a method that will accept a number parameter. We want to return a number as a word in String format

        method(1) -> one
        method(10) -> ten

        return type: String
        method name: convertNumberToWord
        parameter: int
     */
    public static void main(String[] args) {
        System.out.println(convertNumberToWord(3));
        System.out.println(convertNumberToWord(8));
        System.out.println(convertNumberToWord(11));
        System.out.println(convertNumberToWord(-1));
    }

    public static String convertNumberToWord(int number) {

        if (number <= 0 || number > 10) {
            return "out range";
        }
        String[] words = {"one", "two", "three","four","five","six","seven","eight","nine","ten"};

        return words[number - 1];
    }
}


