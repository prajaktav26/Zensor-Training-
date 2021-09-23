package com.Strings;

import java.util.Scanner;

public class Check_Digits {
	private static int n;

	static int checkDigits(String number) {

		// variable to store sum of digits
		int sum = 0;

		// variable to hold character
		char ch;

		// variable to hold numeric value of ch
		int n = 0;
		int count = 0;

		// loop to iterate the String
		for (int i = 0; i < number.length(); i++) {

			// find character
			ch = number.charAt(i);

			// check character is digit?
			if (Character.isDigit(ch)) {
				count++;

				// find numeric value of character
				n = Character.getNumericValue(ch);

				// then add it to sum variable
				sum += n;

			}

		}

		System.out.println("No of Digits in a Enetered string is " + count);
		return sum;

	}

	
	

	public static void main(String[] args) {

		// declare variables
		String str = null;
		int sum = 0;
		int smallest = 0;

		// create Scanner class object
		// for reading the values
		Scanner scan = new Scanner(System.in);

		// read inputs
		System.out.print("Enter String:: ");
		str = scan.next();

		// find sum of digits in the String
		sum = checkDigits(str);

		// display result
		System.out.println("The sum of " + " digits in the string " + str + " = " + sum);

		// close Scanner class object

	}
}
