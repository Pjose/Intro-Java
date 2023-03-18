package com.pj.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

	public static void main(String[] args) {
		// create ArrayList
	    ArrayList<String> languages = new ArrayList<>();

	    // add() method without the index parameter
	    languages.add("Java");
	    languages.add("C++");
	    languages.add("Python");
	    languages.add("Kotlin");
	    System.out.println("ArrayList: " + languages);
	    
	    // get the element from the arraylist
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);
	    
	    System.out.println();
	    
	    // change the element of the array list
	    languages.set(2, "JavaScript");
	    System.out.println("Modified ArrayList: " + languages);
	    
	    str = languages.remove(2);
	    System.out.println("Updated ArrayList: " + languages);
	    System.out.println("Removed Element: " + str);
	    
	    // Using iterator()
        Iterator<String> iterate = languages.iterator();
        System.out.print("ArrayList: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        
	    // iterate using for-each loop
	    System.out.println("Accessing individual elements:  ");

	    for (String language : languages) {
	      System.out.print(language);
	      System.out.print(", ");
	    }
	    System.out.println();
	    
	    // Using clear()
	    languages.clear();
        System.out.println("ArrayList after clear(): " + languages);
	}

}
