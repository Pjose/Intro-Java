package com.pj.intro.control;

/**
 * ForLoop class
 * <p>
 * Demonstrate how to use the for loop and create iterations in code.
 * 
 * @author pjmwa
 */
public class ForLoop {

	public static void main(String[] args) {
		/*
		 * Ex1. Display a Text Five Times
		 */
		int n = 5;
	    // for loop  
	    for (int i = 1; i <= n; ++i) {
	      System.out.println("Java is fun");
	    }
	    
	    /*
	     * Ex2. Display numbers from 1 to 5
	     */
	    // for loop  
	    for (int i = 1; i <= n; ++i) {
	      System.out.println(i);
	    }
	    
	    /*
	     * Ex3. Sum of m Natural Numbers
	     */
	    int sum = 0;
	    int m = 1000;

	    // for loop
	    for (int i = 1; i <= m; ++i) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	    }
	    System.out.println("Sum = " + sum);

	    /* 
	     * for-each loop
	     * Ex4. Print Array Elements
	     */
	    // create an array
	    int[] numbers = {3, 7, 5, -5};
	    
	    // iterating through the array 
	    for (int number: numbers) {
	       System.out.println(number);
	    }
	    
	    /*
	     * Ex5. Iterating through each element of the array using for-each loop
	     * and find the total.
	     */
	    int[] myNumbers = {3, 4, 5, -5, 0, 12};
	    int total = 0;

	    // iterating through each element of the array 
	    for (int number: myNumbers) {
	    	total += number;
	    }
	    System.out.println("Total = " + total);
	    
	    
	    // Infinite loop
	    /* 	for (int i = 1; i <= 10; --i) {
            	System.out.println("Hello");
        	}
        */
	}

}
