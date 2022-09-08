package my_Utilities;

public class ArraysUtil {

    /*
    THis method will accept an int array and return the min number from the array
     */
//minimum number

    public static int minNumber(int[]  arr ){
        int min = arr[0];

        for(int each: arr){
            if(each <min){
                min = each;
            }
        }
        return min;
    }
    //max number
    public static int maxNumber(int[] arr){
        int max = arr[0];

        for(int each: arr){
            if(each > max){
                max=each;
            }
        }

        return max;
    }
//Contains
    public static boolean contains(int[] arr, int num){

        for (int each : arr){
            if(each == num){
                return true;

            }
        }
        return false;

    }
    //Sum of elements
    public static int sumOfElements(int[] arr){
        int sum = 0;

        for (int num: arr) {
            sum += num;
        }

        return sum;
    }

    //Adding new element to the existing element
    public static int [] addElement(int[] arr, int element){

        int[] newArr = new  int[arr.length + 1];

        for(int i =0; i < arr.length; i++){
            newArr[i] = arr[i];

        }

        newArr[newArr.length - 1] = element;

        return  newArr;

    }
    /*
    {1,2,3} ,{4,5}
    [1,2,3,4,5]

     */
    public static int[] addElement(int[] arr, int[] elementsToAdd) {
        int[] newArr = new int[arr.length + elementsToAdd.length]; // new array added

        int index = 0; //
        // we want assing to new array
        for (int each : arr) {
            newArr[index++] = each;  // assingen to the new array
        }
        for(int each: elementsToAdd){
            newArr[index++] = each;
        }

            return newArr;
    }
    //Frequency of Element
    public static int frequencyOfElement(int[] nums, int element){

        int counter = 0;

        for(int each: nums){
            if(each == element){
                counter++;
            }

        }

        return counter;
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        int index = indexOf(arr, "b");
        System.out.println(index);
        index = indexOf(arr, "C");
        System.out.println(index);

    }

    public static int indexOf(int [] arr, int element) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {

                return i;
            }
        }
        return -1;

    }
    public static int indexOf(String [] arr, String element) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(element)) {

                return i;
            }
        }
        return -1;

    }
}