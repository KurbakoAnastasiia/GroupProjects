package com.syntax.task1;


public class GroupHWTask9 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries: 
		 * north america countries, south america countries, europe countries, asian countries, african countries. 
		 * Then print all values from that array using 2 different loops 
		 * and calculate how many total countries been stored.
		 */

		String[][] countries = {
				{"Canada", "USA", "Mexico", "Cuba"},
				{"Brazil", "Argentina", "Ecuador", "Chile"},
				{"Germany", "France", "Italy", "Spain"},
				{"China", "India", "Thailand", "Japan"},
				{"Morocco", "Kenya", "Ghana", "Egypt"}

		};
		int length = 0;
		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + "   ");
			}
			System.out.println();
			length += countries[i].length;
		}
		System.out.println("--------------------2 way loop---------------------------");
		for(String[] rows : countries) {
			for (String country : rows) {
				System.out.print(country + "   ");
			}
			System.out.println();
		}
		System.out.println();
	System.out.println("Total quantity of countries is " + length);
	}

}
