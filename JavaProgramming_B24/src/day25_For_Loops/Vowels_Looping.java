package day25_For_Loops;

public class Vowels_Looping {
    public static void main(String[] args) {

        String str = "java is great";
        int count = 0;

        String vowels = " aeiou";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//            System.out.println(str.substring(i, i+1));

            if (vowels.contains(str.substring(i, i+1))) {
                count++;
            }
        }
        System.out.println(count); // if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o'
    }
}