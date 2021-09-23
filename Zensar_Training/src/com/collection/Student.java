package com.collection;

import java.util.ArrayList;

public class Student {
	int stdRollNo;
	int stdMarks;
	String name;

	Student() {

	}

	public Student(int r, String n, int m) {
		stdRollNo = r;
		name = n;
		stdMarks = m;
	}
	public int compareTo(Student o)
	{
		if(this.stdMarks<o.stdMarks)
			return 1;
		else if(this.stdMarks>o.stdMarks)
			return -1;
		else 
		{
			 return o.stdRollNo-this.stdRollNo;
		}
	}
	public String toString(ArrayList<Student> s)
	{
		String str="Roll No: "+stdRollNo+"Name: "+name+"student Marks:"+stdMarks;
		return str;
	}

	public void stduentMinMarks(ArrayList<Student> l) {
		int min = l.get(0).stdMarks;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(0).stdMarks < min) {
				min = l.get(0).stdMarks;
			}

		}
		System.out.println("Student with less marks" + min);
	}

}
