package com.collection.Comparable;

public class Employee {
	String name;
	String designation;
	int age;
	Employee()
	{
		
	}
	Employee(String s1,String s2,int n)
	{
		name=s1;
		designation=s2;
		age=n;
	}
	public String toString()
	{
		return name+" "+designation+" "+age;
	}
	
}
