package com.Task_Based;

import java.util.Scanner;

public class digi3 {
	
		
	public static boolean hasEight(int number)
	{
	      while(number > 0)
	      {
	          if(number % 10 ==3)
	              return true;

	          number=number/10;
	      }
	      return false; 
	} 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println(hasEight(n));
		
	}

}
