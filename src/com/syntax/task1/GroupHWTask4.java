package com.syntax.task1;

import java.util.Arrays;

public class GroupHWTask4 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] array = {55, 6, 88, 452, 0, -34, 787};
		
		int max = array[0];
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("The maximum number is " + max);
		System.out.println("The minimum number is " + min);
		
		Arrays.sort(array);
		System.out.println("The maximum number is " + array[array.length - 1]);
		System.out.println("The minimum number is " + array[0]);
	}

}
