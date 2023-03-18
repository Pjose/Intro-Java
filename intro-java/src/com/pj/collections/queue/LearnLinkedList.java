package com.pj.collections.queue;

import java.util.LinkedList;

public class LearnLinkedList {

	public static void main(String[] args) {
		// create linkedlist
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
	}

}
