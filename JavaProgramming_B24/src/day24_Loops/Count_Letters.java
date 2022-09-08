package day24_Loops;

public class Count_Letters {
    public static void main(String[] args) {

        String str = "java has apples";

        int count = 0;



        for (int i =0; i < str.length(); i++){ // str.length() -1

            if(str.charAt(i) == 'a'){
                count++;
            }

        }

        System.out.print("a was found " + count + " times");


    }
}
