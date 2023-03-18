package com.pj.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnQueue {

	public static void main(String[] args) {
		/* 
		 * Creating Queue using the LinkedList class
		 */
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
        
        /* 
         * Creating Queue using the PriorityQueue class
         */
        Queue<Integer> numbers2 = new PriorityQueue<>();

        // offer elements to the Queue
        numbers2.offer(5);
        numbers2.offer(1);
        numbers2.offer(2);
        System.out.println("Queue: " + numbers2);

        // Access elements of the Queue
        accessedNumber = numbers2.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        removedNumber = numbers2.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers2);
        
        
	}

}
