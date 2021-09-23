package com.collection.Comparable;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment2 {
	public void makelist(ArrayList<Integer> l)
	{
		l.add(2);
		l.add(34);
		l.add(56);
		l.add(21);
		l.add(0);
		System.out.println(l);
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Assignment2 as2=new Assignment2();
		as2.makelist(al);
		Collections.sort(al);
		System.out.println("After sorting:"+al);
		
	}
	

}
