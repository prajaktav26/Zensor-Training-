package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Iterator;
public class Employee2 {

	public void display(ArrayList<Employee> l) {
//		System.out.println("Using for loop");
//	    for(int i=0;i<l.size();i++)
//		{
//			Employee e = l.get(i);
//			System.out.println(e);//e.toString();
//		}
//		System.out.println("using for each ");
//		for (Employee e : l) {
//			System.out.println(e);
//		}
		System.out.println("using iterator");
		Iterator<Employee> itr = l.iterator();
		while (itr.hasNext()) {

			Employee eo = itr.next();		
//			System.out.println(e);
		}
		
		
		
		System.out.println("Using List Iterator ....");
			ListIterator<Employee> litr = l.listIterator(l.size());
			while(litr.hasPrevious())
			{
				Employee e = litr.previous();
				System.out.println(e);
			}
		
				
			
	}

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<>();
		Employee E1 = new Employee();
		al.add(new Employee(1, "abcd", 1100,"India"));
		al.add(new Employee(2, "aman", 8200,"U.S"));
		al.add(new Employee(3, "ajay", 300,"U.A.E"));
		al.add(new Employee(4, "ajit", 2400,"China"));
		al.add(new Employee(5, "amruta", 6500,"Japan"));
		al.add(new Employee(6, "priya", 9600,"India"));
		
	

	
//		E1.showDetails();
//		E1.employeewithMinsalry(al);
		Employee2 E2 = new Employee2();
		
//		Collections.sort(al);
//		System.out.println("after sorting :"+al);
		
		
//		Collections.sort(al,new byNameComparator());
//		System.out.println("after sorting  by comparator by name:"+al);
		
//		Collections.sort(al,new bySalaryComparator());
//		System.out.println("After Sorting salary by comparator:"+al);
//		E2.display(al);
//		Collections.sort(al);
//		System.out.println("After sorting by comparable:"+al);
		
		

	
		

}
}