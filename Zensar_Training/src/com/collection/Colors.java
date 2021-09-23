package com.collection;
import java.util.ArrayList;
public class Colors {
	String str1;
	ArrayList<String>l1;
	Colors()
	{
		l1=new ArrayList<>();
	}
	public Colors(String s)
	{
		str1=s;
		
		
	}
	void makeList()
	{
		l1.add("Black");
		l1.add("Green");
		l1.add("Red");
		l1.add("whilte");
		l1.add("Blue");
		System.out.println(l1);
	}
	public static void main(String[] args) {
		Colors c1=new Colors();
		c1.makeList();
	
		
	}

}
