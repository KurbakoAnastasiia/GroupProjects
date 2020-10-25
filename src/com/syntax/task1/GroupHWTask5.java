package com.syntax.task1;

import java.util.Arrays;

public class GroupHWTask5 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] array = {1067, 90, 450, -34, 450, 1, 199};

		int max = array[0];
		int secondMax = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax && array[i] != max) {
				
				secondMax = array[i];
			}
		}
		System.out.println(secondMax);

		int[] num1 = { 1, 5, 10, 3, 6 };
		int length = num1.length;
		Arrays.sort(num1); // {1, 3, 5, 6, 10}
		System.out.println("Second highest number is " + num1[length - 2]);
		
		
		
		System.out.println("---------------------------------");
		 int[] myArray = { 2000, 5, 7, 89, 452 };
	        int large = myArray[0];
	        for (int d = 1; d < myArray.length; d++) {
	            if (myArray[d] > large) {
	               large = myArray[d];
	            }
	        }
	        int max2 = 0;
	        for (int q = 0; q < myArray.length; q++) {
	            if (myArray[q] == large) {
	                continue;
	            } else if (myArray[q] > max2) {
	                max2 = myArray[q];
	            }
	        }
	        System.out.println("second largest number is " + max2);
		
		
	}

}
