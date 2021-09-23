package com.Strings;

public class String_Functions {
	public static void main(String[] args) {
		String s1="     hello     ";
		String s2="hello";
		String s3="hii";
		String s4="PRAJAKTA";
		System.out.println("Length of String1: "+s1.length());
		System.out.println("Length of string2: "+s2.length());
		
		//compreTo
		
		System.out.println(s1.compareTo(s2));//0 if both equal
		System.out.println(s2.compareTo(s3));//negative value if s2 is less than s3
		System.out.println(s3.compareTo(s2));//positive value if s3 is greater tahn s2
		
		//trim()
		System.out.println(s1.trim()+"how are you");
		
		//toLowerCase()
		
		System.out.println(s4.toLowerCase());
		//toUpperCase()
		
		System.out.println(s1.toUpperCase());
		
	}

}
