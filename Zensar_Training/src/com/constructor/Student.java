package com.constructor;

public class Student {
	int rollNo;
	String name;
	Student()
	{
		rollNo=3;
		name="riya";
	}
	Student(int i,String s)
	{
		rollNo=i;
		name=s;
	}
	void showStudentDetails()
	{
		System.out.println("RollNO:"+rollNo+"Name:"+name);
	}

}
