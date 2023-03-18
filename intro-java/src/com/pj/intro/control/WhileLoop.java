package com.pj.intro.control;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * Ex1. Display Numbers from 1 to 5
		 */
		// declare variables
	    int i = 1, n = 5;

	    // while loop from 1 to 5
	    while(i <= n) {
	      System.out.println(i);
	      i++;
	    }
	    
	    /* 
	     * Ex2. Sum of Positive Numbers Only
	     */
	    int sum = 0;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // take integer input from the user
	    System.out.println("Enter a number");
	    int number = input.nextInt();
		   
	    // while loop continues 
	    // until entered number is positive
	    while (number >= 0) {
	      // add only positive numbers
	      sum += number;

	      System.out.println("Enter a number");
	      number = input.nextInt();
	    }
		   
	    System.out.println("Sum = " + sum);
	    input.close();
	    
	    /*
	     * do-while loop
	     * 
	     * Ex3. 
	     */
	    int j = 1, m = 5;

	    // do...while loop from 1 to 5
	    do {
	      System.out.println(j);
	      j++;
	    } while(j <= m);

	    /*
	     * Ex4. 
	     */
	    int total = 0;
	    int num = 0;

	    // create an object of Scanner class
	    Scanner in = new Scanner(System.in);
		   
	    // do...while loop continues 
	    // until entered number is positive
	    do {
	      // add only positive numbers
	    	total += num;
	      System.out.println("Enter a number");
	      num = in.nextInt();
	    } while(num >= 0); 
		
	    System.out.println("Total = " + total);
	    in.close();
	    
	    /*
	    // infinite while loop
	    while(true){
	        // body of loop
	    }
	    
	    // infinite do...while loop
	    int count = 1;
	    do {
	       // body of loop
	    } while(count == 1);
	    */
	}
	
}
