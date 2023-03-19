package com.pj.intro.strings;

/**
 * This class demonstrates how to create strings using the <code>String</code>
 * class and shows how to use the methods associated with the class.
 * 
 * @author pjmwa
 */
public class StringDemo {

	public static void main(String args[]) {
		// Creating Strings
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);  
		System.out.println( helloString );

		// String length
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println( "String Length is : " + len );

		// String concatenation
		String string1 = "saw I was ";
		System.out.println("Dot " + string1 + "Tod");

		// Creating format Strings
		/*	     System.out.printf("The value of the float variable is " +
	                  "%f, while the value of the integer " +
	                  "variable is %d, and the string " +
	                  "is %s", floatVar, intVar, stringVar);

	     String fs;
	     fs = String.format("The value of the float variable is " +
	                   "%f, while the value of the integer " +
	                   "variable is %d, and the string " +
	                   "is %s", floatVar, intVar, stringVar);
	     System.out.println(fs);
		 */
	}
}
