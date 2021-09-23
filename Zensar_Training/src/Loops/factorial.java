package Loops;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
	int fact = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Factorial of a number:");
	int number = sc.nextInt();
	for (int i = 1; i <= number; i++) {
		fact = fact * i;
	}
	System.out.println("factorial of a number is:" +fact);

}
}
