package com.collection;

import java.util.ArrayList;

public class InsertAtFirst {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("Red");
		al.add("Green");
		al.add("White");
		al.add("black");
		System.out.println(al);
		al.add(0, "Blue");
		System.out.println("After inserting Element at first position : "+al);
	}

}
