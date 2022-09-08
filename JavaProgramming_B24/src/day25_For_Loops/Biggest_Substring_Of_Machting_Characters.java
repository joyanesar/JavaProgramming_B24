package day25_For_Loops;

public class Biggest_Substring_Of_Machting_Characters {
    public static void main(String[] args) {

        /*
        Given a string find the biggest substring of chars that match and print it
         */

        // input = aaabbbccccddddeee
        //      output =  ccccc

        String str = "aaabbbcccccddddeee";
        String other = "";  // bbb
        String longSub = ""; // aaa

        for (int i = 0; i < str.length() -1; i++) {


            other += str.charAt(i);

            if(str.charAt(i) != str.charAt(i+1)){ // action is done here when the char is not equal to the next one

                if (other.length() > longSub.length()){
                    longSub = other;
                }
                other = "";
            }






            }
        System.out.println(longSub);

        }


    }
