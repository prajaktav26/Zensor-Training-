package Loops;

import java.util.Scanner;

public class palimdromeNo {
	public static void main(String[] args) {
		int temp, rem, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find out palindrome or not!");
		int number = sc.nextInt();
		temp = number;
		while (number > 0) {
			rem = number % 10;
			sum = sum * 10 + rem;
			number = number / 10;

		}
		if (temp == sum) {
			System.out.println("The number is palindrome!....");
		} else {
			System.out.println("The number is not palindrome!...");
		}
	}

}
