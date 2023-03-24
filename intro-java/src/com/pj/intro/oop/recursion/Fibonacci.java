package com.pj.intro.oop.recursion;

/**
 * This class demonstrates how to calculate and find an Nth fibonacci series term using 
 * a recursive method.
 * @author pjmwa
 */
public class Fibonacci {

	public static void main(String[] args) {
		int number = 9;
		int result = fibonacci(number);
		System.out.println("Fibonacci(" + number + "): " + result);
	}

	/**
	 * This recursive method repeatedly calls itself until the value of <code>n</code> is zero.
	 * The method calculates the value of the Nth fibonacci term.
	 * @param n the position of the term number to find
	 * @return the value of the Nth fibonacci term
	 */
	private static int fibonacci(int n) {
		if(n <= 1) {  // Base case - if n ==1 return 1 and if n == 0 return 0
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);  // Recursive calls
	}

}
