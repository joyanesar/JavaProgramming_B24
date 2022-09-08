package day61_collections;

import java.util.PriorityQueue;
import java.util.PropertyResourceBundle;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(20);
        queue.add(8);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll()); // poll removes
        System.out.println(queue);

        //System.out.println(new PriorityQueue<>().remove()); cause exception
        System.out.println(new PriorityQueue<>().poll()); //return null
    }
}
