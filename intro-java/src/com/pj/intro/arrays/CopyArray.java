package com.pj.intro.arrays;

import java.util.Arrays;

/**
 * This class demonstrates the various ways of copying arrays.
 * 
 * @author pjmwa
 * @see    java.util.Arrays
 */
public class CopyArray {

	public static void main(String[] args) {
		/*
		 *  1. Copying Arrays Using Assignment Operator
		 */
		int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays - Shallow Copy
      
        // change value of first array
        numbers[0] = -1;

        // printing the second array
        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
        
        /*
         *  2. Using Looping Construct to Copy Arrays
         */
        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }
      
         // converting array to string
        System.out.println(Arrays.toString(destination));
        
        /*
         *  3. Copying Arrays Using arraycopy() method
         */
        int[] n1 = {2, 3, 12, 4, 12, -2};
        
        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
      
        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));  
      
        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));
        
        /*
         *  4. Copying Arrays Using copyOfRange() method
         */
        int[] src = {2, 3, 12, 4, 12, -2};
        
        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(src, 0, src.length);      
        System.out.println("destination1 = " + Arrays.toString(destination1)); 
      
        // copying from index 2 to 5 (5 is not included) 
        int[] destination2 = Arrays.copyOfRange(src, 2, 5); 
        System.out.println("destination2 = " + Arrays.toString(destination2)); 
        
        /*
         *  5. Copying 2d Arrays Using Loop
         */
        int[][] oldArray = {
                {1, 2, 3, 4}, 
                {5, 6},
                {0, 2, 42, -4, 5}
                };

          int[][] newArray = new int[oldArray.length][];

          for (int i = 0; i < newArray.length; ++i) {
              // allocating space for each row of destination array
        	  newArray[i] = new int[oldArray[i].length];

              for (int j = 0; j < newArray[i].length; ++j) {
            	  newArray[i][j] = oldArray[i][j];
              }
          }
       
          // displaying destination array
          System.out.println(Arrays.deepToString(newArray));  
        
          /*
           *  6. Copying 2d Arrays using arraycopy()
           */
          int[][] oldArray2 = {
                  {1, 2, 3, 4}, 
                  {5, 6},
                  {0, 2, 42, -4, 5}
                  };

            int[][] newArray2 = new int[oldArray2.length][];

            for (int i = 0; i < oldArray2.length; ++i) {
                // allocating space for each row of destination array
            	newArray2[i] = new int[oldArray2[i].length];
                System.arraycopy(oldArray2[i], 0, newArray2[i], 0, newArray2[i].length);
            }
         
            // displaying destination array
            System.out.println(Arrays.deepToString(newArray2));
	}
}
