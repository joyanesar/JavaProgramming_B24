package day61_collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // LIFO  last in first out
        stack.push("a");  // push how to add elements to the top of the stack
        stack.push("b");  // peek returns/ shows what at the top of the stack
        stack.push("c"); // pop removes the element at the top of the stack and returns it
        System.out.println(stack);
        System.out.println("At the top of my stack " + stack.peek());// peek is tell what is on the top
        stack.pop(); // how to exit or removes
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
