package FamilyPractice;

import java.util.Arrays;

public class AnnaGramPractice {
    public static void main(String[] args) {


        String one = "silent";
        String two = "listen";

        char[] oneArray = one.toCharArray();
        char[] twoArray = two.toCharArray();

        Arrays.sort(oneArray);
        Arrays.sort(twoArray);
        System.out.println(Arrays.toString(oneArray));
        System.out.println(Arrays.toString(twoArray));
        System.out.println(Arrays.equals(oneArray, twoArray));



    }
}
