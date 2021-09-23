package Loops;
import java.util.Scanner;
public class No_of_Digits {
	static int countDigit(long n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			++count;
		}
		return count;
	}
	public static void main(String[] args) {
		long n=1234567;
		System.out.println("Number of Digits "+countDigit(n));
	}

}	