package com.pj.intro.testing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This test case class demonstrates how to test the {@link JUnitTesting#countCharOccurance(String, char)}
 * method and compare the expected output from the actual output of the test run.
 * @author pjmwa
 * @see    JUnitTesting#countCharOccurance(String, char)
 */
public class countCharOccuranceTest {

	/**
	 * This test method demonstrates the use of the 
	 * {@link org.junit.Assert#assertEquals(double, double)} method to compare the expected 
	 * output from the actual output of the {@link JUnitTesting#countCharOccurance(String, char)}
	 * method. 
	 */
	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.countCharOccurance("JavaBean", 'a');
		assertEquals(3, output);
	}

}
