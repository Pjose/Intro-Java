package com.pj.intro.oop;

/**
 * This class demonstrates how to create a class and create objects inside the class.
 * @author pjmwa
 */
public class Fan2 {

	// fields
	boolean isOn;

	// methods
	public void turnOn() {
		isOn = true;
	}

	public void display() {
		System.out.println("Is the fan on? " + isOn);
	}

	public static void main(String[] args) {
		Fan2 ceilingFan = new Fan2();  // create an object named ceilingFan
		ceilingFan.display();        // call the display method
		ceilingFan.turnOn();         // call the turnOn method
		ceilingFan.display();
	}
}
