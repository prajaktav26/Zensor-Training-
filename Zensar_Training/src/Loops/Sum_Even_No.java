package Loops;
import java.util.Scanner;
public class Sum_Even_No {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range to find the Even Number:");
		int n1=sc.nextInt();
		int i;
		int sum=0;
	for(i=1;i<=n1;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
		}
	}
	System.out.println("The sum of all even numbers between 1 to " + n1 + " is " + sum);
		
		
		
		
		
	}

}
