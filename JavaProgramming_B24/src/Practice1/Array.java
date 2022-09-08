package Practice1;

public class Array {
    public static void main(String[] args) {

//        int[][] matrix = {{ 1,2,3},
//                          {4,5,6},
//                          {9,8,9}};
//
//        int result = 0;
//        int leftToRight = 0;
//        int rightToLeft = 0;
//        int temp = matrix.length -1;
//
//        for(int rows = 0; rows<matrix.length; rows++){
//            for(int cols = 0; cols < matrix.length; cols++){
//                if(matrix[rows][cols] == matrix[cols][rows]){
//                    leftToRight += matrix[rows][cols];
//                }
//            }
//            rightToLeft += matrix[rows][temp -rows];
//        }
//        System.out.println(leftToRight);
//        System.out.println(rightToLeft);
//
//        result = leftToRight - rightToLeft;
//
//        System.out.println(Math.abs(result));

        String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda"};

//        System.out.println(arr[0]+ " , " + arr[1] + " , " + arr[2]);
//        System.out.println(arr[1]+ " , " + arr[2] + " , " + arr[3]);
//        System.out.println(arr[2]+ " , " + arr[3] + " , " + arr[4]);
//        System.out.println(arr[3]+ " , " + arr[4] + " , " + arr[5]);

        for (int i = 0; i < arr.length - 3; i++) {


           // System.out.println(arr[i] + " , " + arr[i + 1] + " , " + arr[i+2]);

            System.out.println(arr[i] + " , " + arr[i+1]);
        }
    }

}