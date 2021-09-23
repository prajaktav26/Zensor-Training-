package com.collection;

import java.util.ArrayList;

public class RemoveAll {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		al.add(23);
		al.add(36);
		al.add(56);
		al2.add(23);
		al2.add(36);
		al2.add(90);
		al2.add(80);
		al.removeAll(al);
		System.out.println(al);
		
		
	}

}
