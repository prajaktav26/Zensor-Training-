package com.collection;

import java.util.ArrayList;

public class EmptyArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(56);
		al.add(78);
		al.add(90);
		al.removeAll(al);
		System.out.println(al);
	}
		

}
