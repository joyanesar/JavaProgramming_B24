package oopPractice;

public class Encryption {

    public static void main(String[] args) {
        String str = "";

        for(int i = 0; i < str.length(); i++){
            int number = (int) str.charAt(i);
            number++;
            str += (char)number;

            System.out.println(str);
        }
    }
}
