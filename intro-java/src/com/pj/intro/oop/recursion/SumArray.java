package com.pj.intro.oop.recursion;

/**
 * This class demonstrates how to use recursion with an array as a parameter and use recursive
 * method calls to calculate the sum of its elements.
 * @author pjmwa
 */
public class SumArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int result = getSum(numbers, numbers.length);
		System.out.println("Sum of array: " + result);
	}

	/**
	 * This method uses recursive method calls to calculate the sum of the <code>array</code> 
	 * elements.
	 * @param array the array of integers
	 * @param n     the size of the array
	 * @return      the sum value of the integer elements of the array
	 */
	private static int getSum(int[] array, int n) {
		if(n <= 0) {  // Base case
			return 0;
		}
		return (getSum(array, n-1) + array[n - 1]); // Recursive call
	}

}
