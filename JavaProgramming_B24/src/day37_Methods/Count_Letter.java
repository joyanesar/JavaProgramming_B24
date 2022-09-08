package day37_Methods;

public class Count_Letter {
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
    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("apple",'p'));
        System.out.println(frequencyOfLetter("java",'a'));
        System.out.println(frequencyOfLetter("banana",'a'));
        System.out.println(getDuplicateCharacters("javaa"));
        System.out.println(getDuplicateCharacters("appleee"));
    }

    public static int frequencyOfLetter(String word, char letter){
        int counter = 0;

        for(int i=0; i <word.length(); i++){
            if(word.charAt(i) == letter){
                counter++;
            }


        }
        return  counter;
    }


    /*
    return a string of characters that is duplicate in your String

    ex:
    "applepl"
    return ->"pl"
     */

    public static String getDuplicateCharacters(String str){

        String  allDuplicate = "";

        for(int i=0; i < str.length(); i++){
            int count =frequencyOfLetter(str, str.charAt(i));

            if(count > 1){
                allDuplicate += str.charAt(i);
            }
        }
        return allDuplicate;
    }

}
