package Loops;
import java.util.Scanner;

public class Sum_Odd_No {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range: ");
		int n1=sc.nextInt();
		int sum=0,i;
		
		for(i=0;i<=n1;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of all Odd numbers between 1 to " + n1 + " is " + sum);
	}

}
