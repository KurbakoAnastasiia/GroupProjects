package com.syntax.task1;

public class GroupHWTask2 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */

		int num = -11;
	    int result; 
	    boolean isPrime = true;
	    
	    if (num > 1) {
		for (int i = 2; i < num; i++) {
			result = num % i; 
			if (result == 0) {
			isPrime = false;
				break;
			}
		}
	    } else {
	    	isPrime = false;
	    }
		if (isPrime) {
		 System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
	

	}

}
