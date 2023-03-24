package com.pj.intro.testing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class demonstrates how to create a test case for the <code>square()</code> method 
 * in the <code>JUnitTesting</code> class.
 * The name of the class indicates the method being tested.
 * @author pjmwa
 * @see com.pj.intro.testing.JUnitTesting
 */
public class squareTest {

	/**
	 * This test method demonstrates how to use the assertEquals(expected, actual) method 
	 * ({@link org.junit.Assert#assertEquals(double, double)}) to compare the expected output and the actual
	 * output from the square() method ({@link JUnitTesting#square(int)}) of 
	 * the {@link JUnitTesting} class.
	 */
	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
