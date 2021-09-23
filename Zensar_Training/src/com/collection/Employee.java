package com.collection;
import java.util.ArrayList;

import java.util.Comparator;
public class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	int empSalary;
	String country;

	ArrayList<Employee>al;
	
	
	public Employee()
	{
		al=new ArrayList<>();
		
	}
	public Employee(int id,String s1,int e1,String s2)
	{
	   empId=id;
		empName=s1;
		empSalary=e1;
		country=s2;
	}

//	public int compareTo(Employee o)
//	{
//		if(this.empSalary>o.empSalary)
//			return 1;
//		else if(this.empSalary<o.empSalary)
//			return -1;
//		else 
//		{
//			 return o.empId-this.empId;
//		}
//	}
	public int compareTo(Employee o1)
	{
		return this.country.compareTo(o1.country);
		
	}
	
 
public String toString()
{
	String str="Employee Id is:"+empId+" Employee Name:"+empName+" Employee Salary:"+empSalary+"Counrty is:"+country;
	return str;
}
	
	void showDetails()
	{
		for(int i=0;i<al.size();i++)
		{
//			al.get(i);
			Employee e=al.get(i);
			System.out.println(e);
		}

	}
	public void employeewithMinsalry(ArrayList<Employee>list)
	{
		int min=list.get(0).empSalary;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).empSalary<min)
			{
				min=list.get(i).empSalary;
			}
			
			}
		System.out.println("minimum of all elements:"+min);
		}
		
}
class byNameComparator implements Comparator<Employee>
{
	public int compare(Employee o1, Employee o2) {
	
		return o1.empName.compareTo(o2.empName);
	}

	
}
class bySalaryComparator implements Comparator<Employee>
{
	public int compare(Employee o1,Employee o2)
	{
	return (int)o2.empSalary-(int)o1.empSalary;
	}
}
