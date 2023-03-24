package com.pj.intro.testing;

/**
 * This class provides some sample method definitions to be used to demonstrate 
 * how to create JUnit test cases for individual methods and a test suite for the
 * entire class.
 * @author pjmwa
 */
public class JUnitTesting {
	
	/**
	 * This method calculates and returns the square of the parameter.
	 * <pre> Formula: square(x) = x * x</pre>
	 * @param x the value to be squared
	 * @return  the square of the parameter x
	 */
	public int square(int x) {
		return x * x;
	}
	
	/**
	 * This method counts the number of times the <code>character c</code> appears 
	 * in the <code>String str</code>.
	 * @param str the input string
	 * @param c   the character to be searched
	 * @return    the number of times char c appears in the string str
	 */
	public int countCharOccurance(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.toUpperCase().charAt(i) == c || str.toLowerCase().charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
