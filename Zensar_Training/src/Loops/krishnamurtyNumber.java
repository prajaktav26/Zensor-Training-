package Loops;

import java.util.Scanner;

public class krishnamurtyNumber {
	public static void main(String[] args) {
		int rem, temp = 0, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find krishnamurthy number!.....");
		int number = sc.nextInt();
		int m = number;
		while (number > 0) {
			rem = number % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;

			}
			temp = temp + fact;
			number = number / 10;
			fact = 1;
		}

		if (temp == m) {
			System.out.println("Number is krishnamurthy");
		} else {
			System.out.println("Number is not krishnamurthy");
		}

	}

}
