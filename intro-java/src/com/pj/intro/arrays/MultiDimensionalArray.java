package com.pj.intro.arrays;

/**
 * This class demonstrates how to create and use multi-dimensional arrays.
 * 
 * @author pjmwa
 */
public class MultiDimensionalArray {

	public static void main(String[] args) {
		// create a 2D array
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        
        // Print all elements of a 2D array
        System.out.println("Print 2D Array Elelements Using \"for\" Loop");
        System.out.println("==========================================");
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // create a 2D array
        int[][] b = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        // first for...each loop access the individual array
        // inside the 2D array
        System.out.println("Print 2D Array Elements Using \"for-each\" Loop");
        System.out.println("=============================================");
        for (int[] innerArray: b) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.print(data + ", ");
            }
            System.out.println();
        }
        System.out.println();
        
        // create a 3D array
        int[][][] test = {
            {
              {1, -2, 3}, 
              {2, 3, 4}
            }, 
            { 
              {-4, -5, 6, 9}, 
              {1}, 
              {2, 3}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        System.out.println("Print 3D Array Elements Using \"for-each\" Loop");
        System.out.println("=============================================");
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(item + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
	}
}
