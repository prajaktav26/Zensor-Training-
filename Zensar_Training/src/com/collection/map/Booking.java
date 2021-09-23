package com.collection.map;
import java.util.ArrayList;
import java.util.HashMap;
public class Booking {
	public static void main(String[] args) {
		HashMap<Integer,String>m=new HashMap<>();
		m.put(34, "sales");
		m.put(35, "Execution");
		m.put(36, "marketing");
		m.put(37, "quality");
		System.out.println(m);
		String str=m.put(37, "Assurance");
		System.out.println("old value of 37:"+str);
		System.out.println(m);
		
	}
	

}
