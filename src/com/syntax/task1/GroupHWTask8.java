package com.syntax.task1;


public class GroupHWTask8 {
 
	public static void main(String[] args) {
	
		/*
		 * Create a 2D array to store numbers and calculate sum of all odd numbers.
		 */
		
		int[][] nums = {
				{23, 78, 90, 45},
				{1, 3, 387, 0},
				{88, 67, 5, 9}
		};
		int sum = 0;
		for (int[] numRow : nums) {
			for (int num : numRow) {
				if (num % 2 != 0) {
					sum += num; 
				}
			}
		}
		System.out.println(sum);
}
}
