package Method_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Method_Exercise {

    public static void main(String[] args) {
//
//       int[][] num = {
//               {3,5,8},
//               {9,7,5},
//               {10,8,6}
//               };
//
//       int total = 0;
//       for(int [] eachArr : num){
//
//           int sum = 0;
//           for (int each: eachArr){
//               sum += each;
//               total +=sum;
//           }
//
//           System.out.println("Average of each " + Arrays.toString(eachArr) + " is " + (sum / eachArr.length));
//           System.out.println("Total or array is " + total);
//       }
//
//         String [][] allWords = new String[4][];
//
//
//
//
//         String list = "I love Java";
//
//         char[] arr = list.toCharArray();
//
//         String reverse  = "";
//
//         for(int i = arr.length - 1; i>=0; i--){
//
//
//             reverse+=arr[i];
//
//
//         }
   //     System.out.println(reverse);
        String [][] allWords = new String[4][];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple words");
        String[] first = input.nextLine().split(" ");
        System.out.println(Arrays.toString(first));
        allWords[0] = first;

        System.out.println("Enter second words");
        allWords [1]  = input.nextLine().split(" ");

        System.out.println("Enter the third words");
        allWords[2] =input.nextLine().split(" ");





        System.out.println(Arrays.deepToString(allWords));







       }
    }



