package Loops;
import java.util.Scanner;


public class Odd_No {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,r;
		
		System.out.print("Enter the first number for the range: ");
		int num1=sc.nextInt();
		
		System.out.print("Enter the second number for the range: ");
		int num2=sc.nextInt();
		
		System.out.println("Even Numbers Between Specified Range");
		
		i=num1;
		
		while(i<num2)
		{
		r=i%10;
		if(r==0)
		System.out.println(i+"\t");
		i++;
	}
		System.out.println("_______________________________________________________________________________________________________");
		System.out.println("Odd Numbers Between Specified Range");
		i=num1; 
		while(i<=num2){ 
		r=i%2; 
		if(r==1) 
		System.out.println(i+"\t");
		 i++;
			

		}
	
	
}
}
