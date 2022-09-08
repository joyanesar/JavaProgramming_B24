package day24_Loops;

public class Loop_Count_Type {
    public static void main(String[] args) {


        String t = "aahiahiaaahh";

        int hiCounter =0;

        for (int i = 0; i < t.length() -1; i++){

            if(t.charAt(i) == 'h' && t.charAt(i+1) == 'i'){

                hiCounter++;
            }


        }
        System.out.println("Hi used " + hiCounter + " times  in the string");


    }
}
