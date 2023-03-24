package com.pj.intro.oop.recursion;

/**
 * This class demonstrates how to use a recursive method to find the factorial of a 
 * natural number.
 * @author pjmwa
 */
public class Factorial {

	public static void main(String[] args) {
		int number = 6;
		int result;
        result = factorial(number);
        System.out.print(number + " factorial = ");
        System.out.print(number + "! = " + result);
	}

	/**
	 * This recursive method calculates the factorial of a number <code>n</code> by recursively 
	 * calling itself until the value of the parameter <code>n</code> is less than or equal to 1.
	 * <pre>
	 *   n! = n * (n-1) * (n-2) ... * 1
	 *   n! = n * (n-1)!  </pre>
	 * @param n the number to find it's factorial
	 * @return  the factorial of <code>n</code>
	 */
	private static int factorial(int n) {
		if(n <= 1) {  // Base case
			return 1;
		}
		return n * factorial(n - 1);  // Recursive call
	}
}
