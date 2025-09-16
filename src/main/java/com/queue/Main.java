package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);

        System.out.println(queue);

        int removedItem = queue.remove();
        System.out.println(removedItem);
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }

}
