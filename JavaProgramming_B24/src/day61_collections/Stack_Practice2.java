package day61_collections;

import java.util.Stack;

public class Stack_Practice2 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(50);
        stack.add(100);
        stack.add(50);
        stack.add(1,150);
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
