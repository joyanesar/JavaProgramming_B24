package day27_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

//        String s = "apple";
//
//        for (int i = 0; i < s.length(); i++) {
//            int count =0; // resets count to 0 everytime the outer loop runs
//
//            for (int j = 0; j < s.length(); j++) {
//
//                if (s.charAt(i) == s.charAt(j)) {
//                    count++;
//
//                }
//            }
//            if(count == 1){
//                System.out.println(s.charAt(i));
//            }
//        }
//    }

        int row = 10;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i ; j++){
                System.out.println( j + " ");
            }
            System.out.println();
        }

    }
}