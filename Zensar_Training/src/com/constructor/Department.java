package com.constructor;

public class Department {
	int id;
	String name;
	Student s;
	public void setStudent(Student s1)
	{
		s=s1;
		
	}
	Department()
	{
		id=5;
		name="Electrical Department";
	}
	Department(int i,String N,Student s1)
	{
		id=i;
		name=N;
		s=s1;
	}
	public void showDepartmnetDetails()
	{
		System.out.println("Department Id:"+id+"Department Name: "+name);
		s.showStudentDetails();
	}
	public static void main(String[] args) {
		
		Student std=new Student(2,"prajakta");
	
		Department d=new Department(8,"Computer Science",std);
		d.showDepartmnetDetails();
	}
	

}
