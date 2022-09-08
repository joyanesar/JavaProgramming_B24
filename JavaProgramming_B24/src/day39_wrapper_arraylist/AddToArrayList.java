package day39_wrapper_arraylist;

import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Double> number1 = new ArrayList<>();
        ArrayList<Character> char1 = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();

        // assigning a value to array : arr[index] = value

        number.add(50);
        System.out.println(number); // add will put the element to the end
        number.add(-100);
        number.add(200);
        number.add(400);
        number1.add(25.90);
        System.out.println(number1);
        System.out.println(number);
        char1.add('a');
        char1.add('b');
        char1.add('c');
        char1.add('d');
        System.out.println(char1);
        name.add("James");
        name.add("Anna");
        name.add("Sam");
        System.out.println(name.add("James"));

        // reading first element from array: arr[0]
        System.out.println("First element " + name.get(0));
        System.out.println("Last element " + name.get(name.size() -1)); //reading the last elements ArrayList
        System.out.println("last number " + number.get(number.size() -1));

        // for the last index array
        // find the length of array arr.length
        System.out.println( name.size());
        System.out.println(number.size());


    }
}
