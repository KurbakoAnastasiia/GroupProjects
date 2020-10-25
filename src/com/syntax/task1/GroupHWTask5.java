package com.syntax.task1;


public class GroupHWTask5 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		int[] array = {67, 90, 0, -34, 450, 1, 199};
		
		int max = array[0];
		int secondMax = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax) {
				secondMax = array[i];
			}
		}
		System.out.println(secondMax);
	}

}
