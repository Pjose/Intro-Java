package com.pj.intro.arrays;

/**
 * This class demonstrates how to use arrays and loops in statistical calculations.
 * 
 * @author pjmwa
 */
public class StatsArray {

	public static void main(String[] args) {
		int[] numbers = { 4, 17, 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
	    int sum = 0;
	    Double average;

	    // access all elements using for each loop
	    // add each element to sum
	    for (int number : numbers) {
	      sum += number;
	    }

	    // get the total number of elements
	    int arrayLength = numbers.length;

	    // calculate the average
	    // convert the average from int to double
	    average = ((double) sum / (double) arrayLength);

	    System.out.println("Sum = " + sum);
	    System.out.println("Average = " + average);
	}
}
