package com.Strings;

import java.util.Scanner;

import com.Exception.InvalidEmailException;

public class CheckValidEmail {
	public static void checkvalidEmail(String str)
	{

	String emailpath="^[a-zA-Z0-9]+[.][a-zA-Z0-9]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}$";

    if(str.matches(emailpath))
		{
	        System.out.println("Email is Valid");
		}

     else 
     {
	            System.out.println("Email is not valid");
      }
	}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter You Email");
		String s=sc.next();
	      checkvalidEmail(s);

}
}
