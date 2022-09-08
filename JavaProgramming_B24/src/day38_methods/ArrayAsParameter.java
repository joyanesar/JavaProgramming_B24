package day38_methods;

public class ArrayAsParameter {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,1,5};
        printArray(a);
        System.out.println();
        printArray(1, 2, 3, 4);
        String[] str = {"word","word2","etc"};
        String [] act = {"we","need","to","finish","early","today!"};
        //printArray(str);
        printArray(act);
    }

    public static void printArray(int... arr){ //

        for(int each:  arr){
            System.out.println(each);
        }
    }
    public static void printArray(String[] arr){
        for (String each: arr){
            System.out.print(each + " ");
        }
    }
    public static void printArray(String  element, String ... arr){ //(String ... arr, String element){

    }
}
