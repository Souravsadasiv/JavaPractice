package com.java.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class DqDemo {
    public static void main(String[] args) {


        Queue<Integer> queue = new LinkedList<>();
        //Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(50);
        queue.add(30);
        queue.add(80);
        queue.add(40);
        System.out.println(queue);

        //offer shows there is any element in the head or not.
        System.out.println(queue.offer(100));
        System.out.println(queue);

        //remove returns the head of the queue,and removes the head
        System.out.println(queue.remove());
        System.out.println(queue);

        //poll returns the head,remove it from the queue.Not throw any exception if the que is empty.
        System.out.println(queue.poll());

        //element just returns the head.throw exception if the queue is empty
        System.out.println(queue.element());

        //peek just returns the head
        System.out.println(queue.peek());




    }
}
