package Arry_Practice;

public class ArrayNumberPractice {

        /*
//        Create an int array called numbers that has length of 100
//         */
//
//        int[] numbers ={100};
//        for(int i =0; i <numbers.length; i++){
//
//        }
//         System.out.println(Arrays.toString(numbers));
//
//
//        int []number={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
//        for(int eachNumber:number){
//            System.out.print(eachNumber + " ");
//        }

    public static void main(String[] args) {
        String st = "abcdabcdabc";
        String uniqueChars = "";

        for(int i =0; i < st.length(); i++) {


            if (!uniqueChars.contains(" " + st.charAt(i))) {
                uniqueChars += st.charAt(i);
            }
        }
        System.out.println(uniqueChars);


    }

}