package com.syntax.task1;


public class GroupHWTask7 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array to store numbers in 3 rows and 4 columns. 
		 * Develop a program which will identify/print the even numbers only.
		 */
		
		int[][] nums = {
				{56, 76, 33, 45},
				{0, 56, 21, 8},
				{8, 5, 90, 1}
		};
		
		for (int[] numRow : nums) {
			for (int num : numRow) {
				if (num % 2 == 0) {
					System.out.print(num + " ");
				}
			}
		}
	}
}
