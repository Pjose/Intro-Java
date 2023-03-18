package com.pj.intro.arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// declare an array
	    double[] data;
	    
	    // allocate memory
	    data = new double[10];
	    
	    // accessing the first element of an array and assigning a value
	    data[0] = 3.14;
	    
	    System.out.println("data[0]: " + data[0]);

	    //declare and initialize and array
	    int[] age = {12, 4, 5, 2, 5};

	    // access each array elements
	    System.out.println("Accessing Elements of Array:");
	    System.out.println("============================");
	    System.out.println("1st Element: " + age[0]);
	    System.out.println("2nd Element: " + age[1]);
	    System.out.println("3rd Element: " + age[2]);
	    System.out.println("4th Element: " + age[3]);
	    System.out.println("5th Element: " + age[4]);
	    
	    // declare an array
	    int[] weight = new int[5];
	    
	    // initialize array
	    weight[0] = 120;
	    weight[1] = 154;
	    weight[2] = 145;
	    weight[3] = 120;
	    weight[4] = 154;

	    // loop through the array using for loop
	    System.out.println("Using for Loop:");
	    System.out.println("===============");
	    for(int i = 0; i < weight.length; i++) {
	      System.out.println(weight[i]);
	    }

	    // loop through the array using for-each loop
	    System.out.println("Using for-each Loop:");
	    System.out.println("====================");
	    for(int a : age) {
	      System.out.println(a);
	    }
	}
}
