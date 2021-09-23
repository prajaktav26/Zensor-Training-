package com.collection.Comparable;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment1 {
	public void makelist(ArrayList<String> l)
	{
		l.add("prajakta");
		l.add("ankita");
		l.add("ketan");
		l.add("ajay");
		System.out.println(l);
	}
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		Assignment1 as=new Assignment1();
	    as.makelist(al);
	Collections.sort(al);
	System.out.println("After Sorting : "+al);
		
	}

}
