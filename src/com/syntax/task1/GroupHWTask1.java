package com.syntax.task1;

public class GroupHWTask1 {

	public static void main(String[] args) {

		/*
		 * Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable?
		 */

		int i = 6;
		int j = 1;
		i += j;
		j = i - j;
		i -= j;

		System.out.println("The number i = " + i);
		System.out.println("The number j = " + j);

		System.out.println("-------------------------------------------");

		String str1 = "car";
		String str2 = "food";

		System.out.println("Str1 before swap = " + str1);
		System.out.println("Str2 before swap = " + str2);

		str1 = str1 + str2; // firstsecond
		str2 = str1.replaceAll(str2, "");// first
		str1 = str1.replaceAll(str2, "");// second

		System.out.println("Str1 after swap = " + str1);
		System.out.println("Str2 after swap = " + str2);

	}

}
