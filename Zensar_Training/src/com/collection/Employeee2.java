package com.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
public class Employeee2 {
	void display(ArrayList<Employeee> l)
	{
		Iterator<Employeee> itr=l.iterator();
		while(itr.hasNext())
		{
			Employeee e=itr.next();
			if(e.getSalary()>10000)
				System.out.println("salary greater than 10000 is:" + e);
		}
	}
	void displayBYName(ArrayList<Employeee> l)
	{
		Iterator<Employeee> itr=l.iterator();
		while(itr.hasNext())
		{
			Employeee e=itr.next();
			if(e.getName()=="sachin")
				System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Employeee> al=new ArrayList<>();
		al.add(new Employeee("Nataraja G", "Accounts", 8000));
		al.add(new Employeee("karan sinha", "Admin", 800));
		al.add(new Employeee("Naresh H", "Security", 100));
		al.add(new Employeee("mahesh K", "Engineer", 18300));
		al.add(new Employeee("sachin", "Entertainment", 68000));
		Employeee2 emp=new Employeee2();
//		emp.display(al);
//		al.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
		emp.displayBYName(al);
		  

		
	
		
		
	}

}
