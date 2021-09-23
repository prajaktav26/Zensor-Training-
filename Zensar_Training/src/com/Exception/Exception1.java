package com.Exception;
import java.util.Scanner;

public class Exception1{
	static void validEmail(String str) throws InvalidEmailException
    {
	
		String emailpath="^[a-zA-Z0-9]+[.][a-zA-Z0-9]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}$";
		//[a-zA-Z0-9]+[.][a-zA-Z0-9]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}$"
		try {
		
		      if(str.matches(emailpath))
				{
			        System.out.println("Email is Valid");
				}
		
		       else 
		       {
			             throw new InvalidEmailException("Email is not valid");
		        }
		}
		
		catch(InvalidEmailException e)
		{
			e.showError();
	      
		}
			
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter You Email");
		String s=sc.next();
		validEmail(s);
		
		
	}

}
