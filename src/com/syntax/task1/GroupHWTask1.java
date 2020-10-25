package com.syntax.task1;


public class GroupHWTask1 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to swap 2 numbers without a temporary variable? 
		 * Swap  2 strings without a temporary variable?
		 */
		
		int i = 6;
		int j = 1;
		i += j;
		j = i - j;
		i -= j;
		
		System.out.println("The number i = " + i);
		System.out.println("The number j = " + j);
	}

}
