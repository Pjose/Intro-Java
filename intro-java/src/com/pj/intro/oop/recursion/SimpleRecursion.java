package com.pj.intro.oop.recursion;

/**
 * This class demonstrates a simple recursive method (a method that calls itself).
 * @author pjmwa
 */
public class SimpleRecursion {

	public static void main(String[] args) {
		display(5);
	}
	
	/**
	 * This method will print a string to the console if the value of <code>count</code> is 
	 * greater than 1. The method will call itself repeatedly, <code>count</code> number of times
	 * like a loop.
	 * @param count the number of iterations
	 */
	public static void display(int count) {
		if(count < 1) {  // Base case - the condition that stops the iteration
			return;
		}
		System.out.println("Hi there, " + count);
		display(count - 1);  // Recursive call
	}
}
