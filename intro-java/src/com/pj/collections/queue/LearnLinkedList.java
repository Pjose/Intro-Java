package com.pj.collections.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * This class demonstrates how to create and use a <code>LinkedList</code>.
 * <p>
 * The <code>LinkedList</code> class of the Java collections framework provides 
 * the functionality of the linked list data structure (doubly linked list).
 * <p>
 * Since the LinkedList class also implements the <code>Queue</code> and the 
 * <code>Deque</code> interfaces. It can implement methods of these interfaces as well. 
 * 
 * @author pjmwa
 * @see    java.util.Deque
 * @see    java.util.LinkedList
 * @see    java.util.List
 * @see    java.util.Queue
 */
public class LearnLinkedList {

	public static void main(String[] args) {
		// create linked list
	    LinkedList<String> animals = new LinkedList<>();

	    // add() method without the index parameter
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);

	    // add() method with the index parameter
	    animals.add(1, "Horse");
	    System.out.println("Updated LinkedList: " + animals);
	    
	    // get the element from the linked list
	    String str = animals.get(2);
	    System.out.print("Element at index 2: " + str);
	    System.out.println();
	    
	    // change elements at index 3
	    animals.set(3, "Goat");
	    System.out.println("Updated LinkedList: " + animals);
	    
	    // remove elements from index 1
	    str = animals.remove(1);
	    System.out.println("Removed Element: " + str);

	    System.out.println("Updated LinkedList: " + animals);
	    
	    /*
	     * Creating linked list using interfaces provides them the specific
	     * methods for that interface
	     */
	    // create linked list using List
	    List<String> animals1 = new LinkedList<>();

	    // creating linked list using Queue
	    Queue<String> animals2 = new LinkedList<>();

	    // creating linked list using Deque
	    Deque<String> animals3 = new LinkedList<>();
	    
	    /*
	     * List
	     */
	    animals1.add("Cat");
	    animals1.add("Lion");
	    System.out.println("animals1 List: " + animals1);
	    
	    /*
	     * Queue
	     */
	    animals2.add("Dog");
	    animals2.add("Wolf");
	    System.out.println("animals2 Queue: " + animals2);
	    
	    animals2.offer("Hyena");
	    System.out.println("animals2 Updated Queue: " + animals2);
	    
	    /*
	     * Deque
	     */
	    animals3.add("Cow");
	    System.out.println("animals3 Deque: " + animals3);

	    animals3.addFirst("Buffallo");
	    System.out.println("animals3 Deque after addFirst(): " + animals3);

	    // add elements at the end
	    animals3.addLast("Zebra");
	    System.out.println("animals3 Deque after addLast(): " + animals3);
	}
}
