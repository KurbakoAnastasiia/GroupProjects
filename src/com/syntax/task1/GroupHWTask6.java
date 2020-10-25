package com.syntax.task1;


public class GroupHWTask6 {

	public static void main(String[] args) {
		/* Create a 2D array to store numbers in 3 rows and 3 columns.
		 *  Print the sum of all numbers.
		 */
		
		int[][] nums = {
				{23, 9, 1},
				{45, 12, 0},
				{78, 90, -3}
		};

		int sum = 0;
		for (int[] numRow : nums) {
			for (int num : numRow) {
				sum += num;
			}
		}
		System.out.println(sum);
		
		/*  Second variant how to solve the task
		 *  for (int i = 0; i < nums.length; i++) {
		 *   for (int j = 0; j < nums[i].length; j++) {
		 *   sum += nums[i][j];
		 *   }
		 *   }
		 *   System.out.println(sum);
		 */
		
	}

}
