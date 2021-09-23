package Loops;

import java.util.Scanner;

public class ProductofDigits {
	public static void main(String[] args) {
		int rem, product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number u want a product of it: ");
		int number = sc.nextInt();
		while (number > 0) {
			rem = number % 10;
			product = product * rem;
			number = number / 10;
		}
		System.out.println("Product of digit enter by user:" + product);
	}
	}


