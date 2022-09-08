package day38_methods;

public class IndexOfMethod {
     /*
     Create a method that will accept an array and elements
     return the index of the first occurrence of the element


     if the element does not exist in our array, we will return - 1

     after : overload to work with string array
      */
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
