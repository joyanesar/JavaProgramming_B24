package day24_Loops;

public class ReadEachChar {
    public static void main(String[] args) {


        String v = "java";

        //System.out.println(v.charAt(0));

        for (int i = 0; i < v.length(); i++) {   // i <= s.length() -1

            System.out.println(v.charAt(i));

        }
        System.out.println();

        String t = "history";
        System.out.println(t.length());

        for(int i = 0; i < t.length(); i++){
            System.out.println(t.charAt(i));

        }


        String t1 = "java is fun";

        String[] arr = t1.split(" ");

        String revers = "";

        for(int i = arr.length -1; i>=0; i--){

            revers += arr[i] + " ";


//
        }
        System.out.println(revers);
//
//    }
//

    }
}
