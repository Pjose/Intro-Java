package com.pj.intro.oop;

/**
 * This class demonstrates how to create a class and create objects inside the class.
 * @author pjmwa
 */
public class Fan {
	
	// fields
	boolean isOn;
	
	// methods
	/**
	 * This method sets the value of <code>isOn</code> to <code>true</code>
	 */
	public void turnOn() {
		isOn = true;
	}
	
	/**
	 * This method prints the current state of the object to the console.
	 * <pre>
	 * E.g. Is the fan on? false
	 *               or
     *      Is the fan on? true
	 * </pre>
	 */
	public void display() {
		System.out.println("Is the fan on? " + isOn);
	}
	
	/**
	 * This method is the entry point to the program.
	 * @param args    command-line arguments
	 */
	public static void main(String[] args) {
		Fan ceilingFan = new Fan();  // create an object named ceilingFan
		ceilingFan.display();        // call the display method
		ceilingFan.turnOn();         // call the turnOn method
		ceilingFan.display();
	}
}
