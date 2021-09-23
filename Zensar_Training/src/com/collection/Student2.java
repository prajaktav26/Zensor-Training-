package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Student2 {
	public void dispay(ArrayList<Student> list)
	{
	System.out.println("Using Iterator......................");
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println(s);
		}
		System.out.println("Using ListIterator............................");
		ListIterator<Student> litr=list.listIterator(list.size());
		while(litr.hasPrevious())
		{
			Student s1=litr.previous();
			System.out.println(s1);
			
		}
		
	}
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<>();
    Student st=new Student();
    Student2 st2=new Student2();
    al.add(new Student(2,"vikas",100));
    al.add(new Student(3,"amit",200));
    al.add(new Student(4,"Vishal",300));
    al.add(new Student(5,"Anita",400));
    st.stduentMinMarks(al);
    st2.dispay(al);
    
	
	}
}
