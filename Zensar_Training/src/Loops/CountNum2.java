package Loops;

import java.util.Scanner;

public class CountNum2 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("Count of digits:" + count);

	}

}
