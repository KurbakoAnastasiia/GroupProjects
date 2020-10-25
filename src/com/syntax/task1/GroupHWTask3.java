package com.syntax.task1;


public class GroupHWTask3 {

	public static void main(String[] args) {
		
 
		int num1, num2, num3;
	 num1 = 0;
	 num2 = 1; 
		System.out.print(num1 + " " + num2 + " ");
	 for (int i = 1; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
			
		}
System.out.println();
	 int a, b, c;
	 a = 0;
	 b = 1; 
	
	 for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
	}

}
}