package Loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int power = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base index:");
		int index = sc.nextInt();
		System.out.println("Enter the exponents");
		int exponent = sc.nextInt();
		while (exponent > 0) {
			power = power * index;
			exponent--;
		}
		System.out.println(power);

	}

}
