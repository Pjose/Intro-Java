package com.pj.intro.control.exercise;

import java.util.Scanner;

/**
 * LoopsEx1 class - Loops Exercise 1
 * 
 * <p>Exercise questions to practice how to use loops.</p>
 * 
 * @author pjmwa
 * @see    java.util.Scanner
 */
public class LoopsEx1 {

	public static void main(String[] args) {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6_a();
		exercise6_b();
		exercise6_c();
		exercise6_d();
		exercise6_e();
		exercise6_f();
		exercise6_g();
	}

	/**
	 * Question 1: Even numbers.
	 * 
	 * Write a program to print the even numbers from 1 to 30 on the same line separated
	 * by a comma and a space. E.g. 2, 4, 6, ...
	 */
	public static void exercise1() {
		System.out.println("Exercise 1: Even numbers.");
		System.out.println("=========================");
		for(int i=1; i<=30; i++) {
			if(i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}

	/**
	 * Question 2: Multiplication table.
	 * 
	 * Write a program that prompts the user to input a positive integer. It should 
	 * then print the multiplication table of that number. 
	 */
	public static void exercise2() {
		Scanner console = new Scanner(System.in);
		int num;
		System.out.println("Exercise 2: Multiplication table.");
		System.out.println("=================================");
		System.out.print("Enter any positive integer: ");
		num = console.nextInt();

		System.out.println("Multiplication Table of " + num);

		for(int i=1; i<=10; i++)
		{
			System.out.println(num +" x " + i + " = " + (num*i) );
		}
		//console.close();
	}

	/**
	 * Question 3: Is a prime number?
	 * 
	 * Write a program that prompts the user to input a positive integer. It should 
	 * then output a message indicating whether the number is a prime number.
	 */
	public static void exercise3() {
		Scanner console = new Scanner(System.in);

		int number;
		System.out.println("Exercise 3: Is a prime number?");
		System.out.println("==============================");
		System.out.print("Enter the positive integer ");
		number = console.nextInt();

		boolean flag = true;

		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				flag = false;
				break;
			}
		}

		if(flag && number > 1) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		//console.close();
	}

	/**
	 * Question 4: Do while.
	 * 
	 * Write a do-while loop that asks the user to enter two numbers. The 
	 * numbers should be added and the sum displayed. The loop should ask 
	 * the user whether he or she wishes to perform the operation again. 
	 * If so, the loop should repeat; otherwise it should terminate.
	 */
	public static void exercise4() {
		System.out.println("Exercise 4: Do while.");
		System.out.println("=====================");
		Scanner console = new Scanner(System.in);

		int number1, number2;
		char choice;

		do {
			System.out.print("Enter the first number ");
			number1 = console.nextInt();

			System.out.print("Enter the second number ");
			number2 = console.nextInt();

			int sum = number1 + number2;
			System.out.println("Sum of numbers: " + sum);

			System.out.print("Do you want to continue y/n? ");
			choice = console.next().charAt(0);

			System.out.println();

		} while(choice=='y' || choice == 'Y');
		//console.close();
	}

	/**
	 * Question 5: Reverse integer digits.
	 * 
	 * Write a program that prompts the user to input an integer and then 
	 * outputs the number with the digits reversed. For example, if the 
	 * input is 12345, the output should be 54321.
	 */
	public static void exercise5() {
		System.out.println("Exercise 5: Reverse integer digits.");
		System.out.println("===================================");
		Scanner console = new Scanner(System.in);

		int number;
		int reverse = 0;

		System.out.print("Enter the number ");
		number = console.nextInt();

		int temp = number;
		int remainder = 0;

		while(temp>0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp /= 10;
		}

		System.out.println("Reverse of " + number + " is " + reverse);
		//console.close();
	}

	/**
	 * Question 6 (a)
	 * 
	 * Write a program to print the following :

	   **********
	   **********
	   **********
	   **********

	 */
	public static void exercise6_a() {
		System.out.println("Exercise 6 (a)");
		System.out.println("==============");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Question 6 (b)
	 * 
	 * Write a program to print the following :

	   *
	   **
	   ***
	   ****
	   *****

	 */
	public static void exercise6_b() {
		System.out.println("Exercise 6 (b)");
		System.out.println("==============");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Question 6 (c)
	 * 
	 * Write a program to print the following :

	   *
	   **
	   ***
	   ****
	   *****

	 */
	public static void exercise6_c() {
		System.out.println("Exercise 6 (c)");
		System.out.println("==============");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(5-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Question 6 (d)
	 * 
	 * Write a program to print the following :

	   *
	   ***
	   *****
	   *******
	   *********

	 */
	public static void exercise6_d() {
		System.out.println("Exercise 6 (d)");
		System.out.println("==============");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(5-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=(i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Question 6 (e)
	 * 
	 * Write a program to print the following :

	       1
	      222
	     33333
	    4444444
	   555555555

	 */
	public static void exercise6_e() {
		System.out.println("Exercise 6 (e)");
		System.out.println("==============");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(5-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			for(int j=1; j<=(i-1); j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	/**
	 * Question 6 (f)
	 * 
	 * Write a program to print the following :

	       1
	      212
	     32123
 	    4321234
	   543212345

	 */
	public static void exercise6_f() {
		System.out.println("Exercise 6 (f)");
		System.out.println("==============");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(5-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print((i+1)-j);
			}
			for(int j=1; j<=(i-1); j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

	/**
	 * Question 6 (g)
	 * 
	 * Write a program to print the following :
     
	   ******
	   *    *
	   *    *
	   *    *
	   *    *
	   ******
     
	 */
	public static void exercise6_g() {
		System.out.println("Exercise 6 (g)");
		System.out.println("==============");
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i==1 || i==6) {
					System.out.print("*");
				} else {
					if(j==1 || j==6) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
