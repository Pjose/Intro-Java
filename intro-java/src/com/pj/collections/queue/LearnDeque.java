package com.pj.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * This class demonstrates how to create a <code>Deque</code> using the 
 * <code>ArrayDeque</code> class or the <code>LinkedList</code> class.
 * <p>
 * The Deque interface of the Java collections framework provides the functionality 
 * of a double-ended queue. It extends the Queue interface.
 * 
 * @author pjmwa
 * @see    java.util.ArrayDeque
 * @see    java.util.Deque
 * @see    java.util.LinkedList
 */
public class LearnDeque {

	public static void main(String[] args) {
		/*
		 * Classes that implement Deque are;-
		 * 1. ArrayDeque
		 * 2. LinkedList
		 */
		// Array implementation of Deque
		Deque<Integer> numbers = new ArrayDeque<>();

		// LinkedList implementation of Deque
		Deque<String> animal = new LinkedList<>();

        // add elements to the number Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("number Deque: " + numbers);
        
        // add elements to the animal Deque
        animal.offer("Cat");
        animal.offerLast("Dog");
        animal.offerFirst("Horse");
        System.out.println("animal Deque: " + animal);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);
	}
}
