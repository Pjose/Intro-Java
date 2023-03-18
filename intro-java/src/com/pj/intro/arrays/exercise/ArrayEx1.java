package com.pj.intro.arrays.exercise;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
	}
	
	/**
	 * Question 1: Sum Array Elements.
	 * 
	 * Write a program that creates an array of 10 elements size. Your program 
	 * should prompt the user to input numbers in array and then display the 
	 * sum of all array elements.
	 */
	public static void exercise1() {
		System.out.println("Exercise 1: Sum Array Elements.");
        System.out.println("===============================");
        final int SIZE = 10;

        // Create an array to hold numbers.
        int[] numbers = new int[SIZE];

        Scanner console = new Scanner(System.in);
        System.out.println("Enter " + SIZE + " numbers.");

        // Get employees' salary.
        for (int i = 0; i < SIZE; i++) {
           numbers[i] = console.nextInt();
        }

        int sum = 0;

        // Calculate the sum.
        for (int i = 0; i < SIZE; i++) {
           sum += numbers[i];
        }
        
        System.out.println("Sum of numbers: " + sum);
	}
	
	/**
	 * Question 2: Copy Array 
	 * 
	 * The variable list1 and list2 are reference arrays that each have 5 elements. 
	 * Write code that copies the values in list1 to list2. Values in list1 are input 
	 * by user.
	 */
	public static void exercise2() {
		System.out.println("Exercise 2: Copy Array.");
        System.out.println("=======================");
        final int SIZE = 5;

        int[] list1 = new int[SIZE];
        int[] list2 = new int[SIZE];

        Scanner console = new Scanner(System.in);
        System.out.println("Enter " + SIZE + " numbers.");

        // Get value in list1
        for (int i = 0; i < SIZE; i++) {
            list1[i] = console.nextInt();
        }

        // Copy elements in list2.
        for (int i = 0; i < SIZE; i++) {
            list2[i] = list1[i];
        }
        
        // Display elements of list2.
        System.out.println("Elements of list2 are: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(list2[i]);
        }
	}
	
	
	/**
	 * Question 3: Reverse Array.
	 * 
	 * Write a Java program to reverse the element of an integer 1-D array.
	 */
	public static void exercise3() {
		System.out.println("Exercise 3:  Reverse Array.");
        System.out.println("===========================");
        int size;
        
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = console.nextInt();

        int[] list = new int[size];

        System.out.println("Enter " + list.length + " integers.");

        for (int i = 0; i < list.length; i++) {
           list[i] = console.nextInt();
        }

        int temp;
        // Reversing elements of the array.
        for (int i = 0; i < list.length / 2; i++) {
           temp = list[i];
           list[i] = list[list.length - i - 1];
           list[list.length - i - 1] = temp;      
        }

        System.out.println("Reverse array: ");
        // Display the reverse array.
        for (int i = 0; i < list.length; i++) {
           System.out.println(list[i]);
        }
	}
	
	/**
	 * Question 4: Array's Largest & Smallest Element.
	 * 
	 * Write a Java program to find the largest and smallest element of an array.
	 */
	public static void exercise4() {
		System.out.println("Exercise 4: Array's Largest & Smallest Element.");
        System.out.println("===============================================");
        int size;
        
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = console.nextInt();

        int[] list = new int[size];

        System.out.println("Enter " + list.length + " integers.");

        for (int i = 0; i < list.length; i++) {
           list[i] = console.nextInt();
        }

        int max = list[0];
        int min = list[0];
        
        for (int i = 1; i < list.length; i++) {
           if(list[i] > max) {
               max = list[i];
           }
           if(list[i] < min) {
               min = list[i];
           }          
        }

        System.out.println("Largest element: " + max 
                            + " Smallest element: " + min);
	}
	
	/**
	 * Question 5: Merge 2 Arrays.
	 * 
	 * Suppose A, B, C are arrays of integers. The numbers in array A appear in 
	 * ascending order while the numbers in array B appear in descending order. 
	 * Write a user defined method in Java to produce third array C by merging 
	 * arrays A and B in ascending order. Use A, B and C as arguments in the method.
	 */
	public static void exercise5() {
		System.out.println("Exercise 5: Merge 2 Arrays.");
        System.out.println("===========================");
		
	}
}

