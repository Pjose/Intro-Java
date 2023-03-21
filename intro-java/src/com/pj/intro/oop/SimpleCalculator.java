package com.pj.intro.oop;

/**
 * This class demonstrates how to declare and define instance methods and class methods.
 * @author pjmwa
 */
public class SimpleCalculator {
	/**
	 * This private instance method print out the welcome message to the console.
	 * <p>
	 * The private access modifier makes this method only accessible by other member methods.
	 */
	private void welcome() {
		System.out.println("Starting...");
		System.out.println("Welcome to the Simple Calculator");
		System.out.println("================================");
	}
	
	/**
	 * This public instance method calls the private <code>welcome()</code> method.
	 */
	public void init() {
		welcome();
	}
	
	/**
	 * This instance method returns the sum of the parameters.
	 * @param a first parameter to add to
	 * @param b second parameter to add
	 * @return the sum of a and b
	 */
	public double add(double a, double b) {
		double sum = 0;
		sum = a + b;
		return sum;
	}
	
	/**
	 * This instance method returns the difference of the parameters.
	 * @param a first parameter
	 * @param b second parameter
	 * @return difference between a and b
	 */
	public double subtract(double a, double b) {
		double diff = a - b;
		return diff;
	}
	
	/**
	 * This instance method returns the multiplication of the parameters.
	 * @param a first parameter
	 * @param b second parameter
	 * @return multiplication of a and b
	 */
	public double multiply(double a, double b) {
		return a * b;
	}
	
	/**
	 * This instance method returns the division of the parameters.
	 * @param a first parameter
	 * @param b second parameter
	 * @return division of a and b
	 */
	public double divide(double a, double b) {
		return a / b;
	}
	
	/**
	 * This class method returns the square of the parameter.
	 * @param parameter to find the square of
	 * @return square of the parameter
	 */
	public static double square(double a) {
		return a * a;
	}
	
	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		double x = 48;
		double y = 15;
		double result;
		calculator.init();
		System.out.println(x + " + " + y + " = " + calculator.add(x, y));
		result = calculator.subtract(x, y);
		System.out.println(x + " - " + y + " = " + result);
		result = calculator.multiply(x, y);
		System.out.println(x + " * " + y + " = " + result);
		result = calculator.divide(x, y);
		System.out.println(x + " / " + y + " = " + result);
		
		System.out.println("The square of " + x + " is: " + square(x));
		System.out.println("The square of " + y + " is: " + square(y));
	}

}
