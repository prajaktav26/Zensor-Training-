package com.constructor;
import java.util.ArrayList;
import com.collection.Employee;

public class ListIterator {
	public void display(ArrayList<Employee> al)
	{
		for(int i=0;i<al.size();i++)
		{
			Employee e=al.get(i);
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
//		emp1.makeList();
//		emp1.showDetails();
		ArrayList<Employee> elist=new ArrayList<>();
		elist.add(new Employee(34,"pankaj",1000));
		elist.add(new Employee(2, "aman", 2000));
		elist.add(new Employee(3, "ajay", 3000));
		elist.add(new Employee(5, "kavita", 40000));
		ListIterator o =new ListIterator();
		o.display(elist);
		
	
		
	
		
		
		
		
		
	}


}
