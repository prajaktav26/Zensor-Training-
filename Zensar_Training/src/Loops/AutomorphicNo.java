package Loops;

import java.util.Scanner;

public class AutomorphicNo {
	public static void main(String[] args) {
		int square, lastnumber, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the of square for automorphic:");
		int number = sc.nextInt();
		square = number * number;
		square = square % 10;
		lastnumber = number % 10;
		if (square == lastnumber) {
			System.out.println("Automorphic number! ...");
		} else {
			System.out.println("Not an automorphic number: ");
		}
	}

}
