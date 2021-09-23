package com.collection;
import java.util.ArrayList;
public class ArrayListAssign2 {
	ArrayList l=new ArrayList();
	public void makeList()
	{
		l.add(0, 2);
		l.add(1, "abcd");
		System.out.println("l:"+l);
	}
	public static void main(String[] args) {
		ArrayListAssign2 als=new ArrayListAssign2();
		als.makeList();
		
	}
	
}
