package day25_For_Loops;

public class Remove_Duplicates {
    public static void main(String[] args) {


        String str = "abcdabcdabc";
        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {

//            uniqueChars += str.charAt(i);

//            if(uniqueChars.contains("" + str.charAt(i))){
//                continue;
//            }
            if (!uniqueChars.contains("" + str.charAt(i))) {
                uniqueChars += str.charAt(i);

            }


        }
        System.out.println(uniqueChars);

//       String word ="Java is fun";
//
//       String[] arr  = word.split(" ");
//
//       String reverse = "";
//
//       for(int i = arr.length -1; i >=0; i--){
//
//
//           reverse += arr[i] + " ";
//
//
//           System.out.println(reverse);
       }

   }





