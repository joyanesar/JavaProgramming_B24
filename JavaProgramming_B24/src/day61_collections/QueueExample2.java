package day61_collections;

import java.util.ArrayDeque;

public class QueueExample2 {
    public static void main(String[] args) {

        ArrayDeque<String> obj = new ArrayDeque<>();
        obj.offer("z");
        obj.offer("Hello");
        obj.offer("turkey");
        System.out.println(obj);

        System.out.println(obj.peek());
        System.out.println(obj.poll());
        System.out.println(obj);
        //obj.offer(null); I cannot store null in queues
        obj.addFirst("bird");
        System.out.println(obj);
        obj.addLast("water");

        String number = "2";
        int num = Integer.parseInt(number);
        System.out.println(num * 5);

    }
}
