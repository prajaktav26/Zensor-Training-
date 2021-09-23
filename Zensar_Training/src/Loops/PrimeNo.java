package Loops;

public class PrimeNo {
	public static void main(String[] args) {
		String primenumber = "";
		int i = 0, num = 0;
		for (i = 300; i <= 400; i++) {
			int counter = 0;

			for (num = i; num >=1; num--) {
				if (i % num == 0) {
					counter += 1;
				}

			}
			if (counter == 2) {

				primenumber = primenumber + i + "  ";
			}
		}
		System.out.println("Primenumber from 300 to 400: ");
		System.out.println(primenumber);
	}
	}


